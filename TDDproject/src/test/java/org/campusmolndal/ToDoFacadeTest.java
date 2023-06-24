package org.campusmolndal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ToDoFacadeTest {

    @Mock
    private MongoDBOperations mockMongoDBOperations;

    private ToDoFacade sut;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        sut = new ToDoFacade(mockMongoDBOperations);
    }

    @Test
    void verifiesCreateToDoIsCalled() {
        // Arrange
        ToDo todo = new ToDo(1, "Test", false);

        // Act
        sut.createTodo(todo);

        // Assert
        verify(mockMongoDBOperations).create(todo);
    }

    @Test
    void getTodoByIdShouldReturnExpectedToDo() {
        // Arrange
        int id = 1;
        ToDo expectedToDo = new ToDo(id, "Test", false);
        when(mockMongoDBOperations.getTodoById(id)).thenReturn(expectedToDo);

        // Act
        ToDo result = sut.getTodoById(id);

        // Assert
        assertEquals(expectedToDo, result);
    }

    @Test
    void ifYouGetAToDoByIdThatDoesNotExistThenReturnNull() {
        // Arrange
        int nonExistingId = 999;
        when(mockMongoDBOperations.getTodoById(nonExistingId)).thenReturn(null);

        // Act
        ToDo result = sut.getTodoById(nonExistingId);

        // Assert
        assertNull(result);
    }

    @Test
    void updateToDoShouldSuccessfullyUpdateToDo() {
        // Arrange
        int id = 1;
        String newText = "New Text";
        ToDo todo = new ToDo(id, "Test", false);
        when(mockMongoDBOperations.getTodoById(id)).thenReturn(todo);

        // Act
        sut.updateTodoText(id, newText);

        // Assert
        assertEquals(newText, todo.getText());
        verify(mockMongoDBOperations).updateTodoText(todo);
    }

    @Test
    void updateToDoDoneShouldSuccessfullyUpdateToDo() {
        // Arrange
        int id = 1;
        boolean newDoneStatus = true;
        ToDo todo = new ToDo(id, "Test", false);
        when(mockMongoDBOperations.getTodoById(id)).thenReturn(todo);

        // Act
        sut.updateTodoDone(id, newDoneStatus);

        // Assert
        assertEquals(newDoneStatus, todo.isDone());
        verify(mockMongoDBOperations).updateTodoDone(todo);
    }

    @Test
    void verifiesDeleteToDoByIdIsCalled() {
        // Arrange
        int id = 1;

        // Act
        sut.deleteTodoById(id);

        // Assert
        verify(mockMongoDBOperations).delete(id);
    }

    @Test
    void getAllToDosShouldReturnExpectedToDos() {
        // Arrange
        List<ToDo> expectedToDos = Arrays.asList(
                new ToDo(1, "Test 1", false),
                new ToDo(2, "Test 2", true),
                new ToDo(3, "Test 3", false)
        );
        when(mockMongoDBOperations.getAllTodos()).thenReturn(expectedToDos);

        // Act
        List<ToDo> result = sut.getAllTodos();

        // Assert
        assertEquals(expectedToDos, result);
    }
}
package org.campusmolndal;

import java.util.List;

public interface DatabaseOperations {

    // TODO: Break down this interface in smaller chunks

    void create(ToDo todo);

    ToDo getTodoById(int id);

    void updateTodoText(ToDo todo);

    void updateTodoDone(ToDo todo);

    void delete(int id);

    List<ToDo> getAllTodos();
}

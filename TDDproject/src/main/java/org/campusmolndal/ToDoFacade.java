package org.campusmolndal;

import java.util.List;

public class ToDoFacade {
    private MongoDBOperations mongoDBOperations;

    public ToDoFacade(MongoDBOperations mongoDBOperations) {
        this.mongoDBOperations = mongoDBOperations;
    }

    public void createTodo(ToDo todo) {
        mongoDBOperations.create(todo);
    }

    public ToDo getTodoById(int id) {
        return mongoDBOperations.getTodoById(id);
    }

    public void updateTodoText(int id, String newText) {
        ToDo todo = mongoDBOperations.getTodoById(id);
        if (todo != null) {
            todo.setText(newText);
            mongoDBOperations.updateTodoText(todo);
        }
    }

    public void updateTodoDone(int id, boolean newDoneStatus) {
        ToDo todo = mongoDBOperations.getTodoById(id);
        if (todo != null) {
            todo.setDone(newDoneStatus);
            mongoDBOperations.updateTodoDone(todo);
        }
    }

    public void deleteTodoById(int id) {
        mongoDBOperations.delete(id);
    }

    public List<ToDo> getAllTodos() {
        return mongoDBOperations.getAllTodos();
    }
}

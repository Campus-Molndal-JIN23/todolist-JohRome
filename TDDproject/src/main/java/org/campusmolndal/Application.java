package org.campusmolndal;

import java.util.Scanner;

public class Application {
    private MongoDBOperations mongoDBOperations;
    private ToDoFacade toDoFacade;
    private Input input;

    // TODO: Change to dependency injection instead of creating objects in constructor

    public Application() {
        mongoDBOperations = new MongoDBOperations();
        toDoFacade = new ToDoFacade(mongoDBOperations);
        input = new Input(new Scanner(System.in));
    }

    public void runProgram() {
        boolean isDone = false;

        while (!isDone) {
            Output.showTodoMenu();
            switch (input.readCorrectIntFromUser()) {
                case 1 -> letUserCreateTodo();
                case 2 -> Output.printById(toDoFacade, input);
                case 3 -> letUserUpdateToDoText();
                case 4 -> letUserUpdateTodoDone();
                case 5 -> letUserDeleteTodo();
                case 6 -> Output.printAll(toDoFacade);
                case 7 -> isDone = true;
            }
        }
    }

    private void letUserCreateTodo() {
        Output.promptUserToSetIdOnTodo();
        int id = input.readCorrectIntFromUser();
        input.consumeNewLine();
        Output.promptUserToSetTextOnTodo();
        String text = input.readStringFromUser();
        ToDo todo = new ToDo(id, text, false);
        toDoFacade.createTodo(todo);
    }

    private void letUserUpdateToDoText() {
        Output.askUserWichId();
        int id = input.readCorrectIntFromUser();
        input.consumeNewLine();
        Output.promptUserToSetTextOnTodo();
        String newText = input.readStringFromUser();
        toDoFacade.updateTodoText(id, newText);
    }

    private void letUserUpdateTodoDone() {
        Output.askUserToUpdateDoneStatusInTodo();
        toDoFacade.updateTodoDone(input.readCorrectIntFromUser(), true);
    }

    private void letUserDeleteTodo() {
        Output.askUserWichTodoToDelete();
        toDoFacade.deleteTodoById(input.readCorrectIntFromUser());
    }
}

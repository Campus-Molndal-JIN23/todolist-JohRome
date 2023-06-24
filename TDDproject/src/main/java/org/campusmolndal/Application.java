package org.campusmolndal;

import java.util.Scanner;

public class Application {
    private MongoDBOperations mongoDBOperations;
    private ToDoFacade toDoFacade;
    private Input input;

    // Todo: Pass an Input object to the constructor - DONE
    // Todo: Test this class if necessary

    public Application() {
        mongoDBOperations = new MongoDBOperations();
        toDoFacade = new ToDoFacade(mongoDBOperations);
        input = new Input(new Scanner(System.in));
    }

    public void runProgram() {
        boolean isDone = false;

        while (!isDone) {
            Output.showTodoMenu();
            switch (input.readIntFromUser()) {
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
        Output.promptUserToSetIdAndText();
        int id = input.readIntFromUser();
        input.consumeNewLine();
        String text = input.readStringFromUser();
        ToDo todo = new ToDo(id, text, false);
        toDoFacade.createTodo(todo);
    }

    private void letUserUpdateToDoText() {
        Output.askUserToUpdateTextInTodo();
        int id = input.readIntFromUser();
        input.consumeNewLine();
        String newText = input.readStringFromUser();
        toDoFacade.updateTodoText(id, newText);
    }

    private void letUserUpdateTodoDone() {
        Output.askUserToUpdateDoneStatusInTodo();
        toDoFacade.updateTodoDone(input.readIntFromUser(), true);
    }

    private void letUserDeleteTodo() {
        Output.askUserWichTodoToDelete();
        toDoFacade.deleteTodoById(input.readIntFromUser());
    }
}

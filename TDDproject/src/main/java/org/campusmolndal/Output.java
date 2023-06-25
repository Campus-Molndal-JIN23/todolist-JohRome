package org.campusmolndal;

import java.util.InputMismatchException;
import java.util.List;

public class Output {

    public static void showTodoMenu() {
        System.out.println("|---CRUD(L) MENU---|");
        System.out.println("1. Create a new todo");
        System.out.println("2. Read todo by id");
        System.out.println("3. Update todo text");
        System.out.println("4. Update todo done status");
        System.out.println("5. Delete todo by id");
        System.out.println("6. Print all todos");
        System.out.println("7. Exit");
        System.out.println("\nPlease enter your choice: ");
    }

    public static void printAll(ToDoFacade toDoFacade) {
        System.out.println("All documents in the collection:");
        List<ToDo> todos = toDoFacade.getAllTodos();
        todos.forEach(System.out::println);
    }

    public static void printById(ToDoFacade toDoFacade, Input input) {
        System.out.println("Enter the id of the todo you want to see: ");
        System.out.println(toDoFacade.getTodoById(input.readCorrectIntFromUser()));
    }
    public static void promptUserForCorrectInt() {
        System.out.println("Please enter a valid integer");
    }
    public static void promptUserForCorrectString() {
        System.out.println("Please enter a valid string");
    }
    public static void promptUserToSetIdOnTodo() {
        System.out.println("Set an integer id on your todo: ");
    }
    public static void promptUserToSetTextOnTodo() {
        System.out.println("Set a text to your todo: ");
    }
   public static void askUserWichId() {
       System.out.println("What id has the todo?: ");
   }
    public static void askUserToUpdateDoneStatusInTodo() {
        System.out.println("Enter the id on the todo you want to set to done");
    }
    public static void askUserWichTodoToDelete() {
        System.out.println("Enter the id on the todo you want to delete");
    }
    public static void tellUserWrongInputIsMade(InputMismatchException e) {
        System.out.println(e.getMessage());
    }
}

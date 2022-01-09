import java.util.Scanner;

public class Main {

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.startsWith("ADD")) {

            todoList.add(input.substring(4));

        } else if (input.startsWith("EDIT")) {

            System.out.println("Введите номер вашего дела");
            int editIndex = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите название дела на которое хотите заменить");
            String editList = scanner.nextLine();
            todoList.edit(editList, editIndex);
            System.out.println(todoList.getTodos());

        } else if (input.startsWith("DELETE")) {

            System.out.println("Введите номер дела которое вы хотите удалить");
            int editIndex = Integer.parseInt(scanner.nextLine());
            todoList.delete(editIndex);

        } else if (input.startsWith("LIST")) {

            System.out.println("Все дела: " + todoList.getTodos());

        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}

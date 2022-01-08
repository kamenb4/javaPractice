import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String str = "ADD";
        String str1 = "EDIT";
        String str2 = "DELETE";
        String str3 = "LIST";
        if (input.equals(str)) {
            String addList = scanner.nextLine();
            todoList.add(addList);
            System.out.println(todoList.getTodos());
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}

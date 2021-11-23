import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      String error = "Неверный формат номера";
      input = input.replaceAll("[^0-9]", "");
        if (input.charAt(0) == '7' && input.length() == 11) {
          System.out.println(input);
        } else if (input.charAt(0) == '8' && input.length() == 11) {
          input = input.replace('8', '7');
          System.out.println(input);
        } else if (input.charAt(0) == '9' && input.length() == 10) {
          input = '7' + input;
          System.out.println(input);
        } else {
          System.out.println(error);
        }

      //TODO:напишите ваш код тут, результат вывести в консоль.

  }

}

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String encoding1 = "";
    String encoding2 = "";
    String encoding3 = "";
    while (true) {
      String input = scanner.nextLine();
      int flag1 = input.indexOf(" ");
      int flag2 = input.indexOf(" ", flag1 + 1);
        if (flag1 != -1 && flag2 != -1) {
          encoding1 = input.substring(0, flag1);
          encoding2 = input.substring(flag1, flag2);
          encoding3 = input.substring(flag2);

      }
      if (input.equals("0")) {
        break;
      }

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
    System.out.println("Фамилия: " + encoding1);
    System.out.println("Имя:" + encoding2);
    System.out.println("Отчество:" + encoding3);
  }

}
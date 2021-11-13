import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String encoding1, encoding2, encoding3;
    String input = scanner.nextLine();

      int flag1 = input.indexOf(" ");
      int flag2 = input.indexOf(" ", flag1 + 1);

      int spaceCount = 0;
      for(char ch : input.toCharArray()) {

        if(ch == ' ') {
          spaceCount++;
        }
      }

    for(int i = 0; i < input.length(); i++) {

      char c = input.charAt(i);

      if(Character.isDigit(c) || Character.isLowerCase(c)) {
        System.out.println("Введенная строка не является ФИО");
        return;
      } else if ((spaceCount == 2) && (flag1 != -1 && flag2 != -1)) {
        encoding1 = input.substring(0, flag1);
        encoding2 = input.substring(flag1, flag2);
        encoding3 = input.substring(flag2);
        System.out.println("Фамилия: " + encoding1);
        System.out.println("Имя:" + encoding2);
        System.out.println("Отчество:" + encoding3);
        return;
      }
      if(spaceCount != 2) {
        System.out.println("Введенная строка не является ФИО");
        return;
      }
    }


      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

  }

}
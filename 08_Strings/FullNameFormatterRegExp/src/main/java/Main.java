import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
        String[] result = input.split("[\\s]+");
        Pattern error = Pattern.compile("[0-9]+");
        Matcher matcher = error.matcher(input);

        if (input.equals("0")) {
            break;
        }else if ((result.length != 3) || (matcher.find())){
            System.out.println("Введенная строка не является ФИО");
            break;
        } else {
              System.out.println("Фамилия: " + result[0]);
              System.out.println("Имя: " + result[1]);
              System.out.println("Отчество: " + result[2]);
              break;
          }

      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }

}
public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    String first = "";
    for (int i = 0; i < text.length(); i++) {
      char charStr = text.charAt(i);
      if(Character.isDigit(charStr)) {
        first += charStr;
      }
    }
    System.out.println(first);
    //TODO: напишите ваш код, результат вывести в консоль
  }

}
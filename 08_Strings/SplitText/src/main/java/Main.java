import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    String result = "";
    Pattern pattern = Pattern.compile("[a-zA-Z]+\\s");
    Matcher matcher = pattern.matcher(text);
    //TODO реализуйте метод
    return "";
  }

}
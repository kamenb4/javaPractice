import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    System.out.println(splitTextIntoWords("Hello my friend"));
  }

  public static String splitTextIntoWords(String text) {
    StringBuilder result = new StringBuilder();
    Pattern pattern = Pattern.compile("([A-Za-z]+)([']?)([a-z]?)");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      result.append(text.substring(matcher.start(), matcher.end())).append("\n");
    }
    //TODO реализуйте метод
    return result.toString();
  }

}
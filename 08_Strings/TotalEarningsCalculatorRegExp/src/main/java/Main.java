import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    System.out.println(calculateSalarySum(""));
  }

  public static int calculateSalarySum(String text){
    int sum = 0;
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      sum += Integer.parseInt(text.substring(matcher.start(), matcher.end()));
    }
    //TODO: реализуйте метод
    return sum;
  }

}
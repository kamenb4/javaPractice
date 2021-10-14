import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Main {


  public static void main(String[] args) {
    System.out.println(getPeriodFromBirthday(LocalDate.of(1996, 1, 26)));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {

    String formatDate = "";
    LocalDate today = LocalDate.now();

    if(birthday.isBefore(today)) {
      int years = Period.between(birthday, today).getYears();
      int months = Period.between(birthday, today).getMonths();
      int days = Period.between(birthday, today).getDays();
      formatDate = formatDate + years + " years, " + months + " months, " + days + " days.";
    }
    return formatDate;
  }



}

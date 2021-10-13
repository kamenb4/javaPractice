import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class Main {


  public static void main(String[] args) {
    getPeriodFromBirthday(LocalDate.of(1996,1,26));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {

    String formatDate = "";
    LocalDate today = LocalDate.now();

    if(birthday.isBefore(today)) {
      formatDate = formatDate + Period.between(birthday, today).getYears() + " years, "
              + Period.between(birthday, today).getMonths() + " months, "
              + Period.between(birthday, today).getDays() + " days.";
    }
    return formatDate;
  }



}

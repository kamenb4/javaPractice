import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    TreeSet<String> mail = new TreeSet<>();

    public void add(String email) {
        Pattern pattern = Pattern.compile("([A-Za-z0-9]+[\\\\-]?[A-Za-z0-9]+[\\\\.]?[A-Za-z0-9]+)+@([A-Za-z0-9]+[\\\\-]?[A-Za-z0-9]+[\\\\.]?[A-Za-z0-9]+)+[\\\\.][A-Za-z]{2,4}");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            mail.add(email.toLowerCase());
            System.out.println("Email успешно добавлен");
        } else System.out.println(Main.WRONG_EMAIL_ANSWER);

        // TODO: валидный формат email добавляется
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(mail);
    }

}

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    TreeMap<String, String> list = new TreeMap<>();

    public void addContact(String phone, String name) {

        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(phone);

        if (list.containsKey(phone) || list.containsValue(name)) {
            list.replace(phone, name);
        } else list.put(phone, name);
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getContactByPhone(String phone) {
        if (!(list.containsKey(phone))) {
            return "";
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return list.get(phone);
    }


    public Set<String> getContactByName(String name) {
        if (!(list.containsValue(name))) {
            return new TreeSet<>();
        }
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return list.keySet();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        TreeSet<String> result = new TreeSet<>();
        for(String keys : list.keySet()) {
            result.add(list.get(keys) + " - " + keys);
        }
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return result;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}
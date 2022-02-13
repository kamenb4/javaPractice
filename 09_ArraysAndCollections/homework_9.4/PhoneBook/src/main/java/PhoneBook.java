import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {


    TreeMap<String, String> list = new TreeMap<>();

    public boolean formatPhone(String phone) {

        Pattern pattern = Pattern.compile("^\\d{11}$");
        Matcher matcher = pattern.matcher(phone);

        return matcher.matches();

    }

    public boolean formatName(String name) {

        Pattern pattern = Pattern.compile("^[А-Я][а-я]{3,15}$");
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }

    public void addContact(String phone, String name) {

        if (formatPhone(phone) && formatName(name)) {
            if (list.containsKey(phone)) {
                list.replace(phone, name);
            } else list.put(phone, name);
        } else System.out.println("Неверный формат номера телефона");
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getContactByPhone(String phone) {
        String contactsByPhone = list.get(phone) + " - " + list.ceilingKey(phone);
        if (list.containsKey(phone)) {
            return contactsByPhone;
        } else return "";
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку

    }


    public Set<String> getContactByName(String name) {
        Set<String> contactsByName = new TreeSet<>();
        if (list.containsValue(name)) {
            contactsByName.add(name + " - " + list.firstKey());
            return contactsByName;
        } else return list.keySet();
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
    }


    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        Set<String> result = new TreeSet<>();
        for (Map.Entry<String, String> entry : list.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            result.add(value + " - " + key);
        }
//        for(String keys : list.keySet()) {
//            result.add(list.get(keys) + " - " + keys);
//        }
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
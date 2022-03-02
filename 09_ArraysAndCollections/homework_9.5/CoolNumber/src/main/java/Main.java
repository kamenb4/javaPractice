import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите параметры поиска автомобильного номера: " + "\n"
                + "1.Бинарный поиск" + "\n"
                + "2.Поиск прямым перебором" + "\n"
                + "3.Поиск в TreeSet" + "\n"
                + "4.Поиск в HashSet");
        String input = scanner.nextLine();
        List<String> numbers = CoolNumbers.generateCoolNumbers();
        if (input.startsWith("1") || input.startsWith("Бинарный поиск")) {
            System.out.println("Введите номер для поиска: ");
            String binary = scanner.nextLine();
            if (CoolNumbers.binarySearchInList(numbers, binary)) {
                System.out.println("Номер " + binary + " найден.");
            }
        } else if (input.startsWith("2") || input.startsWith("Поиск прямым перебором")) {
            System.out.println("Введите номер для поиска: ");
            String brute = scanner.nextLine();
            if (CoolNumbers.bruteForceSearchInList(numbers, brute)) {
                System.out.println("Номер " + brute + " найден.");
            }
        } else if (input.startsWith("3") || input.startsWith("Поиск в TreeSet")) {
            TreeSet<String> searchTree = new TreeSet<>(numbers);
            System.out.println("Введите номер для поиска: ");
            String searchTreeSet = scanner.nextLine();
            if (CoolNumbers.searchInTreeSet(searchTree, searchTreeSet)) {
                System.out.println("Номер " + searchTreeSet + " найден.");
            }
        } else if (input.startsWith("4") || input.startsWith("Поиск в HashSet")) {
            HashSet<String> searchHash = new HashSet<>(numbers);
            System.out.println("Введите номер для поиска: ");
            String searchHashSet = scanner.nextLine();
            if (CoolNumbers.searchInHashSet(searchHash, searchHashSet)) {
                System.out.println("Номер " + searchHashSet + " найден.");
            } else System.out.println("Данный номер не найден.");

        }
    }
}

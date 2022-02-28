import java.util.*;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        List<String> numbers = new ArrayList<>();
        List<String> numbersWithoutRegion = new ArrayList<>();
        String letters = "";
        String lettersWithoutRegion = "";
        char x, y, z;
        ArrayList<Character> allowedLetters = new ArrayList<>() {{
            add('А');
            add('В');
            add('Е');
            add('К');
            add('М');
            add('Н');
            add('О');
            add('Р');
            add('С');
            add('Т');
            add('У');
            add('Х');
        }};
        for(Character firstLetter : allowedLetters){
            x = firstLetter;
            for (int n = 0; n < 10; n++){
                for (Character secondLetter : allowedLetters){
                    z = secondLetter;
                    for(Character thirdLetter : allowedLetters){
                        y = thirdLetter;
                        lettersWithoutRegion = String.format("%c%d%d%d%c%c", x, n, n, n, z, y);
                        numbersWithoutRegion.add(lettersWithoutRegion);
                    }
                }
            }
        }

        for (String numberWithoutRegion : numbersWithoutRegion) {
            for (int j = 0; j <= 199; j++){
                if(j < 10){
                    letters = String.format("%s0%d", numberWithoutRegion, j);
                    numbers.add(letters);
                }
                else {
                    letters = String.format("%s%d", numberWithoutRegion, j);
                    numbers.add(letters);
                }
            }
        }
        return numbers;
    }

//    private static char generateFirstLetter() {
//        String letters = "АВЕКМНОРСТУХ";
//        char firstLetter = letters.charAt((int) (Math.random() * (letters.length() - 1)) + 1);
//        return firstLetter;
//    };
//
//    private static String generateFirstThreeNumbers() {
//        String firstNum = String.valueOf((int) (Math.random() * 8) + 1);
//        String secondNum = String.valueOf((int) (Math.random() * 8) + 1);
//        String thirdNum = String.valueOf((int) (Math.random() * 8) + 1);
//        return firstNum + secondNum + thirdNum;
//    }
//
//    private static char generateTwoLetters() {
//        String letters = "АВЕКМНОРСТУХ";
//        char secondLetter = letters.charAt((int) (Math.random() * (letters.length() - 1)) + 1);
//        char thirdLetter = letters.charAt((int) (Math.random() * (letters.length() - 1)) + 1);
//        return (char) (secondLetter + thirdLetter);
//    }


//    public static boolean isNumberCool (String number) {
//        Pattern patter = Pattern.compile("/[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}/ui");
//        Matcher matcher = patter.matcher(number);
//        if (matcher.matches()) {
//            return true;
//        } else return false;
//    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
            for (String num : list) {
                if (number.equals(num)) {
                    return true;
                } else {
                    return false;
                }
            }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        int index = Collections.binarySearch(sortedList, number);
        if (index >= 0) {
            return true;
        } else{
            return false;
        }
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        for (String hash : hashSet) {
            if (hash.hashCode() == number.hashCode()) {
                if (hash.equals(number)) {
                    return true;
                } else {
                    return false;
                }
            } else{
                return false;
            }
        }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        if (treeSet.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
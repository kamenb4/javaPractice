public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse (String[] strings){

        for (int i = 0; i < strings.length / 2; i++) {
            String str = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = str;
        }
        return strings;
    }
}

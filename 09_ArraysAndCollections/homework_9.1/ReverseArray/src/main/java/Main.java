public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] b = line.split("[,?\\s]");
        ReverseArray.reverse(b);
    }
}

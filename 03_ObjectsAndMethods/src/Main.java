public class Main {

    public static void main(String[] args) {
        Arithmetic math = new Arithmetic(12,23);
        math.totalProiz();
        math.totalSum();
        math.print();
        math.max();
        math.min();



        Basket basket = new Basket();
        Basket weight = new Basket();
        weight.add("Bread", 45, 2, 0.5);
        weight.add("Meat", 150, 1, 1.5);
        basket.add("Milk", 40);
        weight.print("Первая партия");


    }
}

public class Main {
    public static void main(String[] args){
        Product product = new Product("Молоко", 50);

        Order order = new Order();
        System.out.println(product.setPrice(100));
    }
}

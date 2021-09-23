public class Main {

    public static void main(String[] args) {
        Cargo cargo = new Cargo(24, 50, "25 avenue",
                "Можно переворачивать", "#20165F6AG", "Хрупкое");
        Dimensions truck = new Dimensions(2, 3, 4);
        System.out.println(cargo.setWeight(65));
    }
}

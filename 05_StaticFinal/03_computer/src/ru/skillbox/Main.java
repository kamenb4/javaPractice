package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer(new Processor(64, 4, "Intel", 500),
                new RAM("DDR4", 4, 150), new Storage(StorageType.SSD, 512, 250),
                new Screen(13, ScreenType.IPS, 700),
                new Keyboard("Механическая", true, 600), "TestCompany", "TestName");
        System.out.println(computer);
    }
}

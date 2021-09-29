package ru.skillbox;

public class Computer {

    public final String processor;
    public final String ram;
    public final String storage;
    public final String screen;
    public final String keyboard;
    public final String vendor;
    public final String name;


    public static int calcWeight() {
        Processor proc = new Processor(64,2, "Intel", 200);
        RAM ram = new RAM("DDR4", 4, 50);
        Storage stor = new Storage(StorageType.SSD, 128, 400);
        Screen scr = new Screen(21, ScreenType.IPS, 900);
        Keyboard key = new Keyboard("Mech", "Yes", 500);
        return proc.getWeight() + ram.getWeight() + stor.getWeight() + scr.getWeight() + key.getWeight();
    }


    public Computer(String processor, String ram, String storage,
                    String screen, String keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Computer setProcessor(String processor) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setRam(String ram) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setStorage(String storage) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setScreen(String screen) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setKeyboard(String keyboard) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setVendor(String vendor) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setName(String name) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Процессор: " + processor + "\n"
                + "Оперативная память: " + ram + "\n"
                + "Накопитель: " + storage + "\n"
                + "Экран: " + screen + "\n"
                + "Клавиатура: " + keyboard + "\n"
                + "Произовдитель: " + vendor + "\n"
                + "Название: " + name + "\n"
                + "Общий вес компьютера: " + calcWeight();
    }
}

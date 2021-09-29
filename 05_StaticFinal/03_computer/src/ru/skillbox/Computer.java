package ru.skillbox;

public class Computer {

    private final Processor processor;
    private final RAM ram;
    private final Storage storage;
    private final Screen screen;
    private final Keyboard keyboard;
    private final String vendor;
    private final String name;


    public int calcWeight() {
        return processor.getWeight()
                + storage.getWeight()
                + keyboard.getWeight()
                + ram.getWeight()
                + screen.getWeight();
    }


    public Computer(Processor processor, RAM ram, Storage storage,
                    Screen screen, Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setRam(RAM ram) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setStorage(Storage storage) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setVendor(String vendor) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setName(String name) {
        return new Computer(processor, ram, storage, screen, keyboard, vendor, name);
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return "Процессор: " + "\n" + processor + "\n"
                + "Оперативная память: " + "\n" + ram + "\n"
                + "Накопитель: " + "\n" + storage + "\n"
                + "Экран: " + "\n" + screen + "\n"
                + "Клавиатура: " + "\n" + keyboard + "\n"
                + "Произовдитель: " + vendor + "\n"
                + "Название: " + name + "\n"
                + "Общий вес компьютера: " + calcWeight() + " грамм";
    }
}

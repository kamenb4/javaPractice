package ru.skillbox;

public class Storage {

    public final StorageType type;
    public final int capacity;
    public final int weight;

    public Storage(StorageType type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }


    public StorageType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип накопителя - " + type + "\n"
                + "Объем памяти - " + capacity + "Gb" + "\n"
                + "Вес - " + weight + "грамм" + "\n";
    }

}

package ru.skillbox;

public class Processor {

    public final int frequency;
    public final int numberOfCores;
    public final String creator;
    public final int weight;

    public Processor(int frequency, int numberOfCores, String creator, int weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.creator = creator;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getCreator() {
        return creator;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Частота - " + frequency + "GHZ" + "\n"
                + "Количество ядер - " + numberOfCores + "\n"
                + "Производитель процессора - " + creator + "\n"
                + "Вес - " + weight + "грамм" + "\n";
    }
}

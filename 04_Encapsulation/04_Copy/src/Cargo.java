public class Cargo {
    private final int dimensions;
    private final int weight;
    private final String address;
    private final String property;
    private final String registrationNumber;
    private final String fragility;

    public Cargo(int dimensions,
                 int weight,
                 String address,
                 String property,
                 String registrationNumber,
                 String fragility) {

        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.fragility = fragility;

    }

    public Cargo setDimensions(int dimensions) {
        return new Cargo(dimensions, weight, address, property, registrationNumber, fragility);
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, address, property, registrationNumber, fragility);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, property, registrationNumber, fragility);
    }

    public Cargo setProperty(String property) {
        return new Cargo(dimensions, weight, address, property, registrationNumber, fragility);
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, address, property, registrationNumber, fragility);
    }

    public Cargo setFragility(String fragility) {
        return new Cargo(dimensions, weight, address, property, registrationNumber, fragility);
    }

    public String toString() {
        return "Габариты - " + dimensions + "\n"
                + "Вес - " + weight + "\n"
                + "Адрес - " + address + "\n"
                + "Свойство - " + property + "\n"
                + "Регистрационный номер - " + registrationNumber + "\n"
                + "Хрупкость - " + fragility + "\n";
    }

    public int getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public String getProperty() {
        return property;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFragility() {
        return fragility;
    }
}

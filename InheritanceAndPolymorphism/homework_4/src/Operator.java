public class Operator implements Employee{

    private double fixOperatorSalary = 50_000.0;
    private double salary;

    public Operator() {
        getPosition();
        seMonthSalary();
    }

    public Operator(double fixOperatorSalary) {
        this.fixOperatorSalary = fixOperatorSalary;
        getPosition();
        seMonthSalary();

    }
    @Override
    public double getMonthSalary() {
        return this.salary;
    }

    public void seMonthSalary() {
        this.salary = fixOperatorSalary;
    }

    @Override
    public String getPosition() {
        return "Оператор";
    }

    @Override
    public String toString() {
        return getPosition() + " " + getMonthSalary();
    }
}

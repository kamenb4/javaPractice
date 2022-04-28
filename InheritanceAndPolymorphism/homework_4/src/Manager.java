public class Manager implements Employee {

    private double fixManagerSalary = 70_000.0;
    private double salary;

    public Manager() {
        getPosition();
        setMonthSalary();
    }

    public Manager(double fixManagerSalary) {
        this.fixManagerSalary = fixManagerSalary;
        setMonthSalary();
        getPosition();
    }

@Override
    public double getMonthSalary() {
        return this.salary;
    }

    public void setMonthSalary() {
        this.salary = fixManagerSalary + (115_000.0 + 35_000.0 * Math.random()) * 0.05;
    }
    @Override
    public String getPosition() {
        return "Менеджер";
    }

    @Override
    public String toString() {
        return getPosition() + " " + getMonthSalary();
    }

}

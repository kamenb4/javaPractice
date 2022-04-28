public class TopManager implements Employee{
    private double fixTopManagerSalary = 200_000.0;
    private double salary;

    public TopManager() {
        getPosition();
        setMonthSalary();
    }

    public TopManager(double fixTopManagerSalary) {
        this.fixTopManagerSalary = fixTopManagerSalary;
        setMonthSalary();
        getPosition();
    }
    public double getMonthSalary() {
        return this.salary;
    }

    public void setMonthSalary() {
        this.salary = Company.getIncome() > 10000000 ? fixTopManagerSalary + fixTopManagerSalary * 1.5 : fixTopManagerSalary;
    }

    @Override
    public String getPosition() {
        return "Топ-менеджер";
    }


    @Override
    public String toString() {
        return getPosition() + " " + getMonthSalary();
    }
}

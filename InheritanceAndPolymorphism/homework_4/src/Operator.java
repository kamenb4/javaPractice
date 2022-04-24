public class Operator implements Employee{
    private static final int FIX_SALARY = 10000;
    @Override
    public double getMonthSalary() {
        return FIX_SALARY;
    }

    @Override
    public String toString() {
        return "Operator - " + getMonthSalary();
    }
}

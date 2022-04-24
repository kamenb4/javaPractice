public class TopManager extends Company implements Employee{
    public static final int FIX_SALARY = 15000;

    public double getMonthSalary() {
        if (new Company().getIncome() > 10_000_000) return FIX_SALARY + FIX_SALARY * 1.5;
        else return FIX_SALARY;
    }


    @Override
    public String toString() {
        return "TopManager - " + getMonthSalary();
    }
}

public class Manager implements Employee {
    private static final int FIX_SALARY = 50000;

@Override
    public double getMonthSalary() {
        return FIX_SALARY + bonus(FIX_SALARY);
    }

    @Override
    public String toString() {
        return "Manager - " + getMonthSalary();
    }

    private int bonus(int salary) {
        return (int) (salary + new Company().getStaffIncome() * 0.05);
    }
}

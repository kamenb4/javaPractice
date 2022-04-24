import java.util.*;

public class Company {

    protected static int income = 0;

    List<Employee> staff = new ArrayList<>();

    protected void hire(Employee staff) {
        this.staff.add(staff);
    }

    protected void hireAll(Employee name, int number) {
        if (number != 0) {
            for (int i = 0; i < number; i++) {
                hire(name);
            }
        } else System.out.println("Список пуст.");
    }

    protected void fire(Employee name) {
        if (staff.contains(name)) staff.remove(name);
        else System.out.println("Сотрудник не найден.");
    }

    protected int getIncome() {
        for (int i = 0; i < staff.size(); i++) {
            income += getStaffIncome();
        }
        return income;
    }

    protected int getStaffIncome() {
        return (int) Math.abs(Math.random() * (140_000 - 115_000) + 115_000);
    }

    protected List<Employee> getTopSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> (int) (o2.getMonthSalary() - o1.getMonthSalary()));
    }

    protected List<Employee> getLowestSalaryStaff(int count) {
        return getFilteredLimitedList(count, (o1, o2) -> (int) (o1.getMonthSalary() - o2.getMonthSalary()));
    }

    private List<Employee> getFilteredLimitedList(int count, Comparator<Employee> comparator) {
        List<Employee> copyList = new ArrayList<>(staff);
        copyList.sort(comparator);
        List<Employee> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(copyList.get(i));
        }
        return result;
    }


}

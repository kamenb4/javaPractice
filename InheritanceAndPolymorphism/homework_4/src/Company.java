import java.util.*;

public class Company {

    protected static double income;

    protected ArrayList<Employee> staff = new ArrayList<>();

    protected void hire(Employee staff) {
        this.staff.add(staff);
    }

    protected void hireAll(Employee name, int count) {
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                hire(name);
            }
        } else System.out.println("Список пуст.");
    }

    protected void fire(Employee name) {
        staff.remove(name);
    }

    protected void fireHalf() {
        for (int i = 0; i < staff.size(); i++) {
            staff.remove(staff.get(i));
        }
    }

    protected static double getIncome() {
        return income;
    }

   protected void setIncome(double revenue) {
        income = revenue;
   }
    protected void getTopSalaryStaff(int count) {
        Comparator<Employee> employeeComparator = (o1, o2) -> (int) (o1.getMonthSalary() - o2.getMonthSalary());
        staff.sort(employeeComparator.reversed());

        if (count < staff.size()) {
            for (int i = 0; i < count; i ++) {
                String sallaryFormat = String.format("%.2f", staff.get(i).getMonthSalary());
                System.out.println("* \t" + sallaryFormat + " руб");
            }
        }
    }

    protected void getLowestSalaryStaff(int count) {
        staff.sort((o1, o2) -> (int) (o1.getMonthSalary() - o2.getMonthSalary()));

        if (count < staff.size()) {
            for (int i = 0; i < count; i++) {
                String sallaryFormat =String.format("%.2f", staff.get(i).getMonthSalary());
                System.out.println("* \t" + sallaryFormat + " руб");
            }
        }
    }



}

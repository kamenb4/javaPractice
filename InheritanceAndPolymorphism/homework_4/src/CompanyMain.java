
public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();
        TopManager topManager = new TopManager();
        Operator operator = new Operator();
        Manager manager = new Manager();

        company.hire(topManager);
        company.hireAll(topManager, 5);
        company.hireAll(manager, 5);
        company.hireAll(operator, 5);
        company.fire(topManager);
        company.getIncome();
        System.out.println(company.getTopSalaryStaff(7));
        System.out.println(company.getLowestSalaryStaff(9));

        System.out.println(company.getIncome());
        System.out.println(company.staff);

    }
}

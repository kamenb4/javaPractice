
public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();
        TopManager topManager = new TopManager();
        Operator operator = new Operator(30_000);
        Manager manager = new Manager();
        company.setIncome(56_456_753.0);

        company.hire(new TopManager());
        company.hireAll(new TopManager(140_000.0), 50);
        company.hireAll(new Manager(), 130);
        company.hireAll(operator, 30);
        company.fire(new TopManager());
        System.out.println(company.staff.size());
        company.fireHalf();
        company.fire(operator);
        System.out.println(company.staff.size());



        System.out.println("Доход компании: " + Company.getIncome());
        System.out.println("10 наибольших зарплат:");
        company.getTopSalaryStaff(10);
        System.out.println("10 наименьших зарплат:");
        company.getLowestSalaryStaff(10);

    }
}

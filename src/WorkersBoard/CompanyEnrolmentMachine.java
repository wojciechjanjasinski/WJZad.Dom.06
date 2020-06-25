package WorkersBoard;

public class CompanyEnrolmentMachine {
    public static void main(String[] args) {
        Company company = new Company();
        Worker[] workers = {company.add(), company.add()};
        company.get();
        System.out.println(workers[0]);
        System.out.println(company.get());

    }
}

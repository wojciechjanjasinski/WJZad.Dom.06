package WorkersBoard;

public class CompanyEnrolmentMachine {
    public static void main(String[] args) {
        Company company = new Company();
        Worker[] workers = {company.add()};
        System.out.println(workers[0]);
    }
}

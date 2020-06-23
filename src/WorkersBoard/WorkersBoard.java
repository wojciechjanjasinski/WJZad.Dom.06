package WorkersBoard;

public class WorkersBoard {
    public static void main(String[] args) {
        WorkerCreator workerCreator = new WorkerCreator();
        Worker[] workers = new Worker[3];
        workers[0] = workerCreator.createWorker();
        workers[1] = workerCreator.createWorker();
        workers[2] = workerCreator.createWorker();
        System.out.println(workers[0]);
        System.out.println(workers[1]);
        System.out.println(workers[2]);
        double salarySum = workers[0].getSalary() + workers[1].getSalary() + workers[2].getSalary();
        System.out.println("Firma XYZ potrzebuje łącznie " + salarySum + " PLN na wypłatę za miesiąc pracy " + workers.length + " pracowników");
    }
}

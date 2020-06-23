package WorkersBoard;

public class WorkersBoard {
    public static void main(String[] args) {
        WorkerCreator workerCreator = new WorkerCreator();
        String[] workersBoard = new String[3];
        workersBoard[0] = workerCreator.createWorker().getFirstName() + workerCreator.createWorker().getLastName() + workerCreator.createWorker().getSalary();
        workersBoard[1] = workerCreator.createWorker().getFirstName() + workerCreator.createWorker().getLastName() + workerCreator.createWorker().getSalary();
        workersBoard[2] = workerCreator.createWorker().getFirstName() + workerCreator.createWorker().getLastName() + workerCreator.createWorker().getSalary();
        System.out.println(workersBoard[0]);
        System.out.println(workersBoard[1]);
        System.out.println(workersBoard[2]);


    }
}

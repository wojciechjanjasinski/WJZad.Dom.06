package WorkersBoard;

import java.util.Scanner;

public class WorkerCreator {
    public Worker createWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj prosze imię pracownika: ");
        String firstName = scanner.nextLine();

        System.out.print("Podaj prosze nazwisko pracownika: ");
        String lastName = scanner.nextLine();

        System.out.print("Podaj proszę wysokość wynagrodzenia ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        return new Worker(firstName, lastName, salary);
    }

}

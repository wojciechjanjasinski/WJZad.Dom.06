package WorkersBoard;

import java.util.Scanner;

public class Company {

    Worker add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę imię pracownika: ");
        String firstName = scanner.nextLine();
        System.out.println("Podaj proszę nazwisko pracownika");
        String lastName = scanner.nextLine();
        System.out.println("Podaj proszę wysokość pensji pracownika");
        double salary = scanner.nextDouble();
        return new Worker(firstName, lastName, salary);
    }
    int get (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę numer pracownika:");
        return scanner.nextInt();
    }

}

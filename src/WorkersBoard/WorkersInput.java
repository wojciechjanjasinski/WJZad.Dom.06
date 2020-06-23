package WorkersBoard;

import java.util.Scanner;

public class WorkersInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Worker worker = new Worker();
        String[]getWorkersBoard = new String[3];
        System.out.println("Podaj proszę imię pracownika: ");
        getWorkersBoard[0] = scan.nextLine();
        System.out.println("Podaj proszę nazwisko pracownika: ");
        getWorkersBoard[0] = scan.nextLine();
        System.out.println("Podaj proszę pensję pracownika: ");
        getWorkersBoard[0] = scan.nextLine();

//        System.out.println("Podaj proszę imię pracownika: ");
//        String firstName = scan.nextLine();
//        System.out.println("Podaj proszę nazwisko pracownika: ");
//        String lastName = scan.nextLine();
//        System.out.println("Podaj proszę pensję pracownika: ");
//        String salary = scan.nextLine();





        System.out.println(getWorkersBoard[0]);
    }
}

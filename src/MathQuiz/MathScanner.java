package MathQuiz;

import java.util.Scanner;

public class MathScanner {
    public MathQuiz mathAnswers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wynosi wynik możenia 3 × 5?");
        double a = scanner.nextDouble();

        System.out.println("Jakie jest pole kwadratu o boku 12?");
        double b = scanner.nextDouble();

        System.out.println("Ile wynosi pierwiastek kwadratowy z liczby 15129? ");
        double c = scanner.nextDouble();
        return new MathQuiz(a, b, c);
    }
}

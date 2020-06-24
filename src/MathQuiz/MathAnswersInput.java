package MathQuiz;

import java.util.Scanner;

public class MathAnswersInput {
    public MathQuestions mathUserAnswers (){
        MathNumbers mathNumbers = new MathNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wynosi wynik mnożenia 3 × 5");
        double answerOne = scanner.nextDouble();

        System.out.println("Jakie jest pole kwadratu o boku 12?");
        double answerTwo = scanner.nextDouble();

        System.out.println("Ile wynosi pierwiastek kwadratowy z liczby 15129?");
        double answerThree = scanner.nextDouble();
        return new MathQuestions(mathNumbers.answerOne, mathNumbers.answerTwo, mathNumbers.answerThree);
    }
}

package MathQuiz;

import java.util.Scanner;

import static java.lang.Math.pow;

public class MathQuiz {
    boolean questionOne (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ile wynosi wynik wynik mnożenia 3 × 5 ?");
        double answerOne = scanner.nextDouble();
        return 3*5 == answerOne;
    }
    boolean questionTwo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie jest pole kwadratu o boku 12?");
        double answerTwo = scanner.nextDouble();
        return pow(12, 2) == answerTwo;
    }
    boolean questionThree (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wynosi pierwiastek kwadratowy z liczby 15129?");
        double answerThree = scanner.nextDouble();
        return pow(15129, 2) == answerThree;
    }
    boolean allAnswersRight (){
        return questionOne() && questionTwo() && questionThree();
    }
    boolean allAnswersWrong (){
        return !questionOne() && !questionTwo() && !questionThree();
    }
}

package MathQuizTwo;

public class MathTest {
    public static void main(String[] args) {
        MathScanner mathScanner = new MathScanner();
        MathQuiz mathQuiz = new MathQuiz();
        double[] numbersUserInput = new double[1];
        numbersUserInput[0] = mathScanner.mathAnswers().a;
        numbersUserInput[0] = mathScanner.mathAnswers().b;
        numbersUserInput[0] = mathScanner.mathAnswers().c;


        mathQuiz.questionOne(numbersUserInput[0]);
        mathQuiz.questionTwo(numbersUserInput[0]);
        mathQuiz.questionThree(numbersUserInput[0]);

        System.out.println(mathQuiz.questionOne(numbersUserInput[0]));
        System.out.println(mathQuiz.questionTwo(numbersUserInput[0]));
        System.out.println(mathQuiz.questionThree(numbersUserInput[0]));

// 228886641
    }
}

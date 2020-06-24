package MathQuiz;

public class MathQuiz {
    public static void main(String[] args) {
        MathAnswersInput mathAnswersInput = new MathAnswersInput();
        double[] mathNumbers = new double[1];
        mathNumbers[0] = mathAnswersInput.mathUserAnswers().mathNumbers.answerOne;

        System.out.println(mathNumbers[0]);

        // 228886641

    }
}

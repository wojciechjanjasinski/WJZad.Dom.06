package MathQuiz;

import static java.lang.Math.pow;

public class MathQuestions {

    MathNumbers mathNumbers;

    public MathQuestions(double answerOne, double answerTwo, double answerTwo1) {
    }

    public MathQuestions() {

    }

    boolean questionOne() {
        return 3 * 5 == mathNumbers.answerOne;
    }

    boolean questionTwo() {
        return pow(12, 2) == mathNumbers.answerTwo;
    }

    boolean questionThree() {
        return pow(15129, 2) == mathNumbers.answerOne;

    }


}

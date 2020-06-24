package MathQuiz;

import static java.lang.Math.pow;

public class MathQuestions {

    public MathQuestions(double answerOne, double answerTwo, double answerTwo1) {
    }

    public MathQuestions() {

    }

    boolean questionOne(double answerOne) {
        return 3 * 5 == answerOne;
    }

    boolean questionTwo(double answerTwo) {
        return pow(12, 2) == answerTwo;
    }

    boolean questionThree(double answerThree) { return pow(15129, 2) == answerThree; }


}

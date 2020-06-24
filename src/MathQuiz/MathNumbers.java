package MathQuiz;

public class MathNumbers {
    double answerOne;
    double answerTwo;
    double answerThree;

    public MathNumbers(double answerOne, double answerTwo, double answerThree) {
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
    }

    public MathNumbers() {
    }

    @Override
    public String toString() {
        return "MathNumbers{" +
                "answerOne=" + answerOne +
                ", answerTwo=" + answerTwo +
                ", answerThree=" + answerThree +
                '}';
    }
}

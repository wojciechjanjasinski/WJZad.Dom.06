package MathQuizTwo;

import static java.lang.Math.pow;

public class MathQuiz {
    double a;
    double b;
    double c;

    public MathQuiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MathQuiz() {
    }

    boolean questionOne(double a) {
        return 3 * 5 == a;
    }

    boolean questionTwo(double b) {
        return pow(12, 2) == b;
    }

    boolean questionThree( double c){
        return pow(15129, 2) == c;
    }
}

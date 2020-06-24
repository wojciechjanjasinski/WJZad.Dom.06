package MathQuiz;

public class MathTest {
    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();
        boolean[] mathQuestions = new boolean[3];
        mathQuestions[0] = mathQuiz.questionOne();
        mathQuestions[1] = mathQuiz.questionTwo();
        mathQuestions[2] = mathQuiz.questionThree();

        int correctAnswers = 0;
        if(mathQuestions[0]) correctAnswers++;
        if (mathQuestions[1]) correctAnswers++;
        if (mathQuestions[2]) correctAnswers++;

        System.out.println("Odpowiedź na pierwsze pytanie była: " + mathQuestions[0]);
        System.out.println("Odpowiedź na drugie pytanie była: " + mathQuestions[1]);
        System.out.println("Odpowiedź na trzecie pytanie była: " + mathQuestions[2]);
        System.out.println(correctAnswers + " z " + mathQuestions.length + " odpowiedzi było poprawnych");
    }
}
// 228886641
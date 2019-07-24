package pl.homework.app;

import pl.homework.utils.QuizTools;

public class QuizGame {
    public static void main(String[] args) {
        boolean endQuiz;
        QuizTools quiz = new QuizTools();

        do {
            endQuiz = quiz.studyNumber();
        } while (!endQuiz);
        quiz.endQiuz();
    }
}

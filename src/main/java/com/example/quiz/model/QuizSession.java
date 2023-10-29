package com.example.quiz.model;

import com.example.quiz.utils.CSVLoader;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class QuizSession {
    private List<Question> questions;
    private int currentQuestionIndex;
    private int correctAnswersCount;

    public void fetchQuestion() {
        questions = CSVLoader.getQuestions();
    }

    public void moveToNextQuestion() {
        currentQuestionIndex++;
    }

    public boolean isQuizEnded() {
        return currentQuestionIndex == questions.size();
    }

    public void checkCorrectQuestion(int answerIndex) {
        if (questions.get(currentQuestionIndex).checkAnswer(answerIndex)){
            correctAnswersCount++;
        }

    }

    public void resetQuiz() {
        currentQuestionIndex = 0;
        correctAnswersCount = 0;
    }
}

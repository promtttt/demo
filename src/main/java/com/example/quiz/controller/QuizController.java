package com.example.quiz.controller;

import com.example.quiz.model.Question;
import com.example.quiz.model.QuizSession;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "QuizController", value = "/QuizController")
public class QuizController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session == null || session.getAttribute("quizSession") == null) {
            QuizSession quizSession = new QuizSession();
            quizSession.fetchQuestion();
            session.setAttribute("quizSession", quizSession);
        }
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");
        Question question = quizSession.getQuestions().get(quizSession.getCurrentQuestionIndex());
        request.setAttribute("question", question);
        request.getRequestDispatcher("/quiz.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int answer = Integer.parseInt(request.getParameter("option"));
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");
        quizSession.checkCorrectQuestion(answer);
        quizSession.moveToNextQuestion();
        if (quizSession.isQuizEnded()) {
            int score = quizSession.getCorrectAnswersCount();
            request.setAttribute("score", score);
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        } else {
            doGet(request, response);
        }
    }
}
package com.example.preguntas;

public class QuestionLibrary {

    private String mQuestions [] = {
            "1.- Lorem ipsum sit amet?",
            "2.- Lorem ipsum sit amet",
            "3.- Lorem ipsum sit amet",
            "4.- Lorem ______ ipsum sit amet"
    };

    private String mChoices [][] = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"},
            {"1", "5", "0"}
    };

    private String mCorrectAnswers[] = {"1", "5", "8", "0"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

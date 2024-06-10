package org.example;

public class Question {

    // these are all private so to access them we need to use getters and setters
    private String question;
    private String[] options; // we have different or many options
    private String answer;


    // g e t t e r s     n     s e t t e r s
    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String[] getOptions() {
        return options;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}





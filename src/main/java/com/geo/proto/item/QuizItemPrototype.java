package com.geo.proto.item;

public class QuizItemPrototype {
    private final long id;
    private final String question;
    private final String answer;

    public QuizItemPrototype(long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question: " + question + "\n" + "Answer: " + answer;
    }
}

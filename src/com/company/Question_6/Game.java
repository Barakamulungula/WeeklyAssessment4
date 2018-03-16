package com.company.Question_6;

public class Game {

    private String title;
    private String dueDate;

    public Game(String title) {
        this.title = title;
        dueDate = "";
    }

    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}


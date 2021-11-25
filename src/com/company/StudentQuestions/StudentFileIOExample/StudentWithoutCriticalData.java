package com.company.StudentQuestions.StudentFileIOExample;

import java.io.Serializable;

public class StudentWithoutCriticalData implements Serializable {
    String name;
    String house;
    int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}

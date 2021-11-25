package com.company.StudentQuestions.StudentFileIOExample;

public class StudentWithEncrytptedCriticalData extends StudentWithoutCriticalData {
    public String getDate() {
        return date;
    }

    String date;

    public void setDate(String date) {
        this.date = date;
    }
}

package com.company.StudentQuestions.StudentFileIOExample;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class StudentWithoutCriticalData implements Externalizable {
    String name;
    String house;
    int score;
    Date dateOfBirth;
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(score);
        out.writeObject(encryptDate(dateOfBirth));
        out.writeObject(house);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        score = in.readInt();
        dateOfBirth =  decryptDate((String)in.readObject());
        house = (String) in.readObject();
    }

    private String encryptDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String month = "" + (char)(cal.get(Calendar.MONTH) + 'a');
        String day = "" + (char)(cal.get(Calendar.DATE)+'a');
        String year = convertYearToString( cal.get(Calendar.YEAR));
        String encryptedDate = String.join("/", day, month, year);
        return encryptedDate;
    }

    private String convertYearToString(int i) {
        StringBuilder str= new StringBuilder();
        int cnt =4;
        while (cnt >0) {
            str.append((char) (i % 10 + 'a'));
            cnt--;
            i/=10;
        }
        return str.toString();
    }

    private Date decryptDate(String encryptedDate) {
        String[] dateArray = encryptedDate.split("/");
        int day = dateArray[0].charAt(0) - 'a';
        int month = dateArray[1].charAt(0) - 'a';
        int year = convertStringToYear(dateArray[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, 0 ,0);
        return cal.getTime();
    }

    private int convertStringToYear(String yearString) {
        int cnt = 3;
        int year = 0;
        while (cnt >=0 ) {
            year = yearString.charAt(cnt) + (year*10) - 'a';
            cnt--;
        }
        return year;
    }
}

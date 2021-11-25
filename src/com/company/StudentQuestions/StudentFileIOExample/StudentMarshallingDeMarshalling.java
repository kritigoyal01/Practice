package com.company.StudentQuestions.StudentFileIOExample;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class StudentMarshallingDeMarshalling implements  Serializable{
    public void writeToFile(StudentC sn, String filename) throws IOException {
        StudentWithEncrytptedCriticalData studentWithEncrytptedCriticalData = new StudentWithEncrytptedCriticalData();
        studentWithEncrytptedCriticalData.setDate(encryptDate(sn.getDateOfBirth()));
        System.out.println("Encrypted date:" + encryptDate(sn.getDateOfBirth()));
        studentWithEncrytptedCriticalData.setName(sn.getName());
        FileOutputStream fo = new FileOutputStream(filename);
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(studentWithEncrytptedCriticalData);

        fo.close();
        o.close();
    }

    public StudentC readToFile(String filename) throws IOException, ClassNotFoundException {
        StudentWithEncrytptedCriticalData sd = null;
        FileInputStream fi = new FileInputStream(filename);
        ObjectInputStream oi = new ObjectInputStream(fi);
        sd = (StudentWithEncrytptedCriticalData) oi.readObject();

        StudentC student = new StudentC();
        student.setName(sd.getName());
        student.setDateOfBirth(decryptDate(sd.getDate()));
        return student;
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

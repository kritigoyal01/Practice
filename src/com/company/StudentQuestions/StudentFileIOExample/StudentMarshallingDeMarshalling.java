package com.company.StudentQuestions.StudentFileIOExample;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class StudentMarshallingDeMarshalling {
    public void writeToFile(StudentWithoutCriticalData sn, String filename) throws IOException {

        FileOutputStream fo = new FileOutputStream(filename);
        ObjectOutputStream o = new ObjectOutputStream(fo);
        o.writeObject(sn);

        fo.close();
        o.close();
    }

    public StudentWithoutCriticalData readToFile(String filename) throws IOException, ClassNotFoundException {
        StudentWithoutCriticalData sd = null;
        FileInputStream fi = new FileInputStream(filename);
        ObjectInputStream oi = new ObjectInputStream(fi);
        sd = (StudentWithoutCriticalData) oi.readObject();
        return sd;
    }



}

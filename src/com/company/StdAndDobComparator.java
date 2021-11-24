package com.company;

import com.company.Student;

import java.util.Comparator;

public class StdAndDobComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int cmp = o1.getStd() - o2.getStd();
        if(cmp!=0)
            return cmp;

        return o1.getDob().compareTo(o2.getDob());
    }
}

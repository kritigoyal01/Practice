package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        System.out.println("Hello Worls");
        List<Student> studentList = new ArrayList<>();
        Date date1=new SimpleDateFormat("dd/MM/yyyy"). parse("2/06/1998");
        studentList.add(new Student("s1",1,date1,"Blue",120.0));

        Date date2=new SimpleDateFormat("dd/MM/yyyy"). parse("03/01/1998");
        studentList.add(new Student("s2",1,date2,"Blue",220.0));

        Date date3=new SimpleDateFormat("dd/MM/yyyy"). parse("04/04/1998");
        studentList.add(new Student("s3",2,date3,"yellow",222.0));

        Date date4=new SimpleDateFormat("dd/MM/yyyy"). parse("28/02/1998");
        studentList.add(new Student("s4",1,date4,"yellow",111.0));

        Date date5=new SimpleDateFormat("dd/MM/yyyy"). parse("01/01/1998");
        studentList.add(new Student("s5",2,date5,"green",111.0));
        Iterator<Student> it= studentList.iterator();
        for (Student s : studentList){
            System.out.println(s.getStd() + " :" + s.getFname()  +":" + s.getDob() );
        }

        System.out.println("After");
        Collections.sort(studentList,new StdAndDobComparator());

        for (Student s : studentList){
            System.out.println(s.getStd() + " :" + s.getFname()  +":" + s.getDob() );
        }
        genericeNumbers g = new genericeNumbers();
        System.out.println(g.addNumbers(1,234356.0));

        Map<String, Double> housecredit = studentList.stream()
                .collect(Collectors.groupingBy(Student::getHouse, Collectors.summingDouble(Student::getCreditScore)));
        System.out.println(housecredit);
    }

}

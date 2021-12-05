package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GradeBased s1 = new  GradeBased("Ali");
        MarkBased s2 = new MarkBased("Ahmad");
        s1.addGrade('A');
        s1.addGrade('A');
        s1.addGrade('A');
        s1.addGrade('A');
        s1.addGrade('A');

        s2.addMark(99);
        s2.addMark(99);
        s2.addMark(99);
        s2.addMark(99);
        s2.addMark(99);

        ArrayList <Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);

        for (int i = 0; i < myStudents.size() ; i++) {
            System.out.println(myStudents.get(i));
        }
    }
}

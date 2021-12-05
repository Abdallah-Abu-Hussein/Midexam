package com.company;

import java.util.ArrayList;

public class GradeBased extends Student {

    public GradeBased(String name) {
        super(name);

    }

    private ArrayList <Character> grades = new ArrayList<>();

    public void addGrade(char grade){
        grades.add(grade);
    }

    @Override
    double calculateAverage() {
        int A_Students_Count = 0;
        for (int i = 0; i < grades.size() ; i++) {
            if (grades.get(i) == 'A')
                A_Students_Count++;
        }

        return A_Students_Count;
    }
}

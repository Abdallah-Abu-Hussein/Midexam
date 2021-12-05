package com.company;

import java.util.ArrayList;

public class MarkBased extends Student{

    public MarkBased(String name) {
        super(name);
    }
    private ArrayList<Integer> Marks = new ArrayList<Integer>();
    public void addMark(int mark){
        Marks.add(mark);
    }

    @Override
    double calculateAverage() {

        double MarksSum = 0;
        for (int i = 0; i <= Marks.size()-1; i++) {
            MarksSum+=Marks.get(i);
        }
//        System.out.println(MarksSum);
        double Marks_Size = Marks.size();
        return MarksSum/Marks_Size;
    }


}

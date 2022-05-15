package com.company;

public class Task1 {
    public static void main(String[] args) {
        DisplayShapes ds = new DisplayShapes();
        for (int i = 0; i < 7; i++) {
            System.out.println(ds);
            ds.changeShape();
        }
    }
}

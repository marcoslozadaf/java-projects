package com.rajendarreddyj.basics.condition;

public class TwoDimensionalArrayDemo {
    public static void main(final String[] args) {
        int[][] marks = new int[3][6];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = (int) (Math.random() * 100);
            }
        }

        // Iterating through arrays to display marks
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Marks in subject :" + marks[i][j]);
            }
        }
    }
}

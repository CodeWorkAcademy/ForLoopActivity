package com.company;

public class BottlesOfBeer {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--)
        {
            System.out.printf("%d bottles of beer in the wall.", i);
            System.out.println();
            System.out.printf("%d bottles of beer.", i);
            System.out.println();
            System.out.println("If one of the bottles should happen to fall,");
            System.out.printf("%d bottles of beer in the wall", i - 1);
            System.out.println();
            System.out.println();
        }
    }
}
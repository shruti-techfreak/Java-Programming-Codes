package com.company;

public class Patternproblems {
    public static void main(String[] args) {
        int n=4;
        int i, j;

        //LEFT HALF PYRAMID PATTERN
        for (i=n; i>=1; i--){    // FOR REVERSE LEFT HALF PYRAMID WRITE THIS AS--> for(i=1; i<=n; i++)
            for (j=1; j<i; j++){
                System.out.print(" ");
            }
            for (j=0; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


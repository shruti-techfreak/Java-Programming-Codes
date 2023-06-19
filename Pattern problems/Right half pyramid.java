package com.company;

public class Patternproblems {
    public static void main(String[] args) {
        int n=4;
        int i, j;
        //Print a pattern for right angle triangle
       //incrementing loop
        for(i=0; i<n; i++){
            for (j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      //decrementing loop
        for(i= n; i>=1; i--){
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

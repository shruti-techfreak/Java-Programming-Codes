package com.company;

public class Patternproblems {
    public static void main(String[] args) {
        int n=4;
        int i, j;

        //TRIANGLE STAR PATTERN
        for (i=1; i<=n; i++){
            for (j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (j=n; j>n-i; j--){
                if (j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

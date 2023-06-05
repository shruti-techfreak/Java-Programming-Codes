package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //Using For Loop
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        //to print first n odd numbers:
        for(i=0; i<n; i++){
            System.out.println(2*i+1);
        }


        /*
        //Using do while loop
        int a=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        do{
            System.out.println(a);
            a++;
        }while (a<=n);
        */

    }
}

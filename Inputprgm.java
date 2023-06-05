package com.company;
import java.util.Scanner;
public class Inputprgm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int a= sc.nextInt();
        System.out.println(a+2);

        System.out.println("Enter string");
        String str= sc.next();
        System.out.println(str);
        //String str1= sc.nextLine();
        //System.out.println(str1);

        System.out.println("Enter number to check if it is integer: ");
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
    }
}

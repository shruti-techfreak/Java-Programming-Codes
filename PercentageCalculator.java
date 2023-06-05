package com.company;
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args){
        float total= 500;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        float eng= sc.nextFloat();
        float math= sc.nextFloat();
        float science= sc.nextFloat();
        float sst= sc.nextFloat();
        float it= sc.nextFloat();
        float sum=eng+math+science+sst+it;
        float percent= (sum/total)*100;
        System.out.println("Your percentage are: "+percent+"%");
    }

}

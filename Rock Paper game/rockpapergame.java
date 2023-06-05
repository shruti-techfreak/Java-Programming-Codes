package com.company;
import java.util.Scanner;

public class rockpapergame {
    public static void main(String[] args) {
        //1-rock 2-paper 3- scissor
        //By using while loop for 5 rounds

        System.out.println("There are 5 rounds");
        System.out.println("Note: 1-rock 2-paper 3- scissor");
        System.out.println("--------------------------------------");
        int a,b;
        int n=1;
        int t1=0, t2=0;
        Scanner sc= new Scanner(System.in);

        while (n<=5){
            System.out.println("Round-" + n);
            System.out.println("Enter no for player A");
            a=sc.nextInt();
            int min=1;
            int max=3;
            b= (int) (Math.random()*(max-min+1)+min);
            System.out.println(b);

            if(a>3||a==0){
                System.out.println("Wrong number entered!");
                n-=1;
            }
            else if ((a==1&&b==3) || (a==2&&b==1) || (a==3&&b==2)){
                System.out.println("Player A wins!");
                t1+=1;
            }
            else if ((b==1&&a==3) || (b==2&&a==1) || (b==3&&a==2)){
                System.out.println("Player B wins!");
                t2+=1;
            }
            else {
                System.out.println("Tie");
            }
            n++;
        }
        
        System.out.println("---------------------------------------------");
        if (t1>t2){
            System.out.println("\nCONGRATULATIONS!!\nPLAYER A IS WINNER!");
        }
        else if (t1==t2){
            System.out.println("\nOOPS! THERE IS A TIE");
        }
        else{
            System.out.println("\nPLAYER B IS WINNER!");
        }

    }
}

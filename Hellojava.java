import java.util.Scanner;


public class Hellojava {
	public static void main(String[] args)
	{
		System.out.println("Hello Java Program!");
		System.out.println("Enter Name:");
		Scanner s= new Scanner(System.in);
		String name= s.next();
		System.out.println("Hello "+name);
		System.out.println("Enter RollNo.:");
		int rollno= s.nextInt();
		System.out.println("Roll No is "+rollno);
	}
}

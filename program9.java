//Write a method with following method header. public static int gcd(int num1, int num2) 
//Write a program that prompts the user to enter two integers and compute the gcd of two integers.
import java.util.*;
public class gcdFinder
{
public static void main(String[] args)
	{  	
		System.out.println("please enter your 2 integer value");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		gcdFind(number1,number2);
	}
public static int gcdFind(int number1,int number2)
{	int d=0;
	while(number1%2==0 && number2%2==0)
	{	
		number1=number1/2;
		number2=number2/2;
		d++;
		}
		while(number1!=number2)
		{
		if (number1%2==0){number1=number1/2;}
                else if (number2%2==0){number2=number2/2;}
		else if (number1 > number2){number1 = (number1-number2)/2;}
		else {number2 = (number2-number1)/2;}
		}
		int gcd = number1*(int)(Math.pow(2,d));
		System.out.println("your GCD is " + gcd );
		return gcd;
	}	
}

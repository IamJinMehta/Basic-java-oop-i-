/*Write a test program that prompts the user to enter ten numbers, invoke a method to reverse the numbers,display the numbers. */
import java.util.Scanner;
public class numReverse
{	
	public static void main(String[] args)
	{
		int i,j;
		Scanner n = new Scanner(System.in);
		int[] num = new int[10];
		for(i=0; i<=9; i++)
		{
			System.out.println("please enter " + (i+1) + " integer number: ");
			num[i] = n.nextInt();
		}
		for(j=9; j>=0; j--)
		{      
			System.out.println("your " + (10-j) + " integer is: " + num[j]);
		}
	}	
}

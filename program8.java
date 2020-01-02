//Write a program that reads an integer and displays all its smallest factors in increasing order.
//For example if input number is 120, the output should be as follows:2,2,2,3,5. 
import java.util.Scanner;
public class program8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter an integer: ");
		int num = input.nextInt();
		int identifier = 2;
		while(num/identifier != 1)
		{
			if(num % identifier == 0)
				{	
				System.out.print(identifier + ",");
				num = num/identifier;
				}
				else
				{
				identifier++;	
				}
			}
			System.out.println(num + ".");
		}
	}

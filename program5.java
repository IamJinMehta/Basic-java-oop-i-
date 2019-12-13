/*Write a program that prompts the user to enter three integers and display the integers in decreasing order*/

import java.util.Scanner;
public class program5
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter three values: ");
int num1 = input.nextInt();
int num2 = input.nextInt();
int num3 = input.nextInt();
if ((num1 > num2) && (num2 > num3)){
    System.out.println (num1 + num2 + num3);
    }
if ((num1 > num2) && (num2 < num3)){
    System.out.println(num1 + num3 + num2);
    }
if ((num1 < num2) && (num2 < num3)){
    System.out.println( num3 + num2 + num1);
    }
if ((num1 < num2) && (num2 > num3)){
    System.out.println(num2  + num1 + num3);
    }
}
}

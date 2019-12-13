/*Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant. */

import java.util.Scanner;
public class program6
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.print("Enter three values: ");
char latter = scan.next().charAt(0)
	;
if ((latter == 'a')||(latter == 'e')||(latter == 'i')||(latter == 'o')||(latter == 'u'))
    {
    System.out.println ("latter is vowel");
    }
else{
    System.out.println("latter is consonant");
    }
    }
    }

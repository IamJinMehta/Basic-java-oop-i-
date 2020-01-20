/*Write a program that prompts the user to enter a letter and check whether a letter is a vowel or constant. */

import java.util.Scanner;
public class program6
{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.print("Enter the letter: ");
char latter = scan.next().charAt(0);
if ((latter == 'a')||(latter == 'e')||(latter == 'i')||(latter == 'o')||(latter == 'u'))
    {
    System.out.println ("latter is vowel");
    }
else if ((latter == 'A')||(latter == 'E')||(latter == 'I')||(latter == 'O')||(latter == 'U'))
    {
    System.out.println ("latter is vowel");
    }
    else
    {
    System.out.println("latter is consonant");
    }
    }
    }

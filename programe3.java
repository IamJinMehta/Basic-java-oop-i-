/*Write a program that reads a number in meters, converts it to feet, and displays the result. */

import java.util.Scanner;
class program3
{  
   public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.println("please enter value in meter");
    float meter = input.nextFloat();
    double feet = meter*3.28084;
    System.out.println(  meter  + "meter" + "=" + feet + "feet"); 
    } 
} 

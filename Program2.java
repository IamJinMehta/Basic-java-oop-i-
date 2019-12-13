/*Write a program that solves the following equation and displays the value x and y: 1) 3.4x+50.2y=44.5  2) 2.1x+.55y=5.9 
Assume Cramer’s rule to solve equation 1.)ax+by=e 2.)cx+dy=f  (x=ed-bf/ad-bc y=af-ec/ad-bc ) */

import java.util.Scanner;
public class Program2
{ 
    public static void main(String[] args) 
    {
    System.out.println("equation 1:- aX+bY=e");
    System.out.println("equation 2:- cX+dY=f");
    Scanner input = new Scanner(System.in);
    System.out.print("please enter value of a");
    float a = input.nextFloat();
    System.out.print("please enter value of b");
    float b = input.nextFloat();
    System.out.print("please enter value of c");
    float c = input.nextFloat();
    System.out.print("please enter value of d");
    float d = input.nextFloat();
    System.out.print("please enter value of e");
    float e = input.nextFloat();
    System.out.print("please enter value of f");
    float f = input.nextFloat();   
    double det =((a) * (d) - (b) * (c));
    double x = ((d) * (e) - (b) * (f)) / det;
    double y = ((a) * (f) - (c) * (e)) / det;
    System.out.print("x=" + x + " y=" + y); 
    } 
} 

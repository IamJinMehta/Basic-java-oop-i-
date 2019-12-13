/*Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters. */

import java.util.Scanner;
class program4
{  
   public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.println("please enter your weight in pounds");
    double pound = input.nextDouble();
    System.out.println("please enter your height in inches");
    double inche = input.nextDouble();
    double kg=pound*0.453592;
    double meter=inche*0.0254;
    double BMI = kg/(meter*meter);
    System.out.println("your BMI is" + BMI); 
    } 
} 

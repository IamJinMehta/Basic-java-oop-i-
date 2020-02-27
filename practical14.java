/*Write a program that creates an Array List and adds a Loan object , a Date object , a string, and a Circle object to the list, 
and use a loop to display all elements in the list by invoking the object’s to String() method. */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Exp14
{
    public static void main(String[] args)
    {
        ArrayList<Object> obj = new ArrayList<Object>();

        Loan loan1=new Loan();
        loan1.setAcc_no(123);
        Circle circle1=new Circle();
        circle1.setradius(12);

        obj.add(loan1);
        obj.add(new Date());
        obj.add(new String("Hello Humans"));
        obj.add(circle1);
        for(int i=0; i<obj.size(); i++)
            System.out.println((obj.get(i)).toString());
    }
}
public class Loan{
    int Acc_no;
    String Acc_name;
    public Loan()
    {

    }
    public Loan(int Acc_no,String Acc_name)
    {
        this.Acc_no=Acc_no;
        this.Acc_name=Acc_name;
    }
    public int getAcc_no()
    {
        return Acc_no;
    }
    public void setAcc_no(int Acc_no)
    {
        this.Acc_no=Acc_no;
    }
    public String getAcc_name()
    {
        return Acc_name;
    }
    public void setAcc_name(String Acc_name)
    {
        this.Acc_name=Acc_name;
    }
    public String toString(){
        return "your loan acc no is" + this.getAcc_no()+"";
    }
}
public class Circle{
    double radius = 1;

    public Circle(double newradius)
    {
        radius=newradius;
    }

    public Circle() {

    }

    public double getradius()
    {
        return radius;
    }
    public void setradius(double newradius)
    {
        this.radius=newradius;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public String toString(){
        return "your circle area is" + getArea() + "";
    }
}

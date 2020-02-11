/**
*Write a program for calculator to accept an expression as a string in which the operands and 
*operator are separated by zero or more spaces. For ex: 3+4 and 3 + 4 are acceptable expressions.
*/

import java.util.Scanner;
public class program13
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    double answer=0;
      System.out.println ("please enter your expression:");
    String str = s.nextLine ();
    char[] opt = { '+', '-', '*', '/' };
    int idx = -1;
    for (int i = 0; i < opt.length; i++)
      {
	if (str.indexOf(opt[i])!=-1)
	  {
	    idx = i;
	    break;
	  }
      }
    if (idx == -1)
      {
	System.out.println ("please give the valid expression....");
	System.exit (0);
      }
    char op = opt[idx];
    System.out.println ("your operator is " + op);
    double opr1 = Double.parseDouble (str.substring (0, str.indexOf(op)));
    double opr2 =
      Double.
      parseDouble (str.substring (str.indexOf(op) + 1, str.length()));

    switch (op)
      {
      case '+':
	answer = opr1 + opr2;
	break;
      case '-':
	answer = opr1 - opr2;
	break;
      case '*':
	answer = opr1 * opr2;
	break;
      case '/':
	answer = opr1 / opr2;
	break;
      }
    System.out.println ("your answer is "+answer);
  }
}

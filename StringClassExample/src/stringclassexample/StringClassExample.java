
package stringclassexample;

import java.util.Scanner;


public class StringClassExample 
{


    public static void main(String[] args)
    {
       String username;
       Scanner input=new Scanner(System.in);
       
       System.out.println("Enter your username ");
       username=input.nextLine();
       
       if(username.length()<10)
       System.out.println(" Youre not daddy cool");
       else
       {
           System.out.println("AYYYYYY daddy cool");
       }
       
    }
    
}

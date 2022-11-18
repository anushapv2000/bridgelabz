package bridgelabz.ifelseProblems;

import java.util.Scanner;

public class DigitWord
{
    public static void  main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        
        if(no==1)
               System.out.println("One");
        else if(no==2)
               System.out.println("Two");
        else if (no==3)
                 System.out.println("Three");
        else if (no==4)
            System.out.println("Four");
        else if (no==5)
            System.out.println("Five");
        else if (no==6)
            System.out.println("Six");
        else if (no==7)
            System.out.println("Seven");
        else if (no==8)
            System.out.println("Eight");
        else if (no==9)
            System.out.println("Nine");
        else
            System.out.println("Not a digit");
       }
    }


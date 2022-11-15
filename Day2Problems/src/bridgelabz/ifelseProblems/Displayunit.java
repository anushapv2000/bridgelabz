package bridgelabz.ifelseProblems;

import java.util.Scanner;

public class Displayunit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number among [1,10,100,1000]");
        int no=sc.nextInt();
        if(no==1)
            System.out.println("Unit");
        else if(no==10)
            System.out.println("Ten");
        else if(no==100)
            System.out.println("Hundred");
        else if (no==1000)
            System.out.println("Thousand");
        else
            System.out.println("Not a number within the above mentioned range");
        }
    }


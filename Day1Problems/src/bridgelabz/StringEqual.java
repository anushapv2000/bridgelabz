package bridgelabz;

import java.util.Scanner;

public class StringEqual
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1");
        String str1=sc.next();
        System.out.println("Enter the string 2");
        String str2=sc.next();
        if (str1.equals(str2)){
            System.out.println("String are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

    }
}

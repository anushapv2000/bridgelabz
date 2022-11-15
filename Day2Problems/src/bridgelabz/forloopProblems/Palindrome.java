package bridgelabz.forloopProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num=n;
        int rev=0,no=0;
        for (no=n%10;n!=0;n=n/10 ) {
            no=n%10;
            rev = rev * 10 + no;
        }
        if (rev==num){
            System.out.println(num+" is palindrome");
        }
        else {
            System.out.println(num+" is not palindrome");
        }

    }
}

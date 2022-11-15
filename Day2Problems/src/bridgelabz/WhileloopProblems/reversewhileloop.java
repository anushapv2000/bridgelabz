package bridgelabz.WhileloopProblems;

import java.util.Scanner;

public class reversewhileloop {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n=sc.nextInt();
        int rev=0,no=0;
        while(n!=0){
            no=n%10;
            rev=rev*10+no;
            n=n/10;
        }
        System.out.println("reversed number is "+rev);
    }
}

package bridgelabz.forloopProblems;

import java.util.Scanner;

public class reverseforloop {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n=sc.nextInt();
        int rev=0,no=0;
        for (no=n%10;n!=0;n=n/10 ) {

            no=n%10;
            rev = rev * 10 + no;

        }
        System.out.println("reversed number is "+rev);
    }
}



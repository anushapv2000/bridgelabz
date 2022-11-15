package bridgelabz.WhileloopProblems;

import java.util.Scanner;

public class sumWhileloop {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int n=sc.nextInt();
        int i=1,s=0;

        while(i<=n)
        {
            s=s+i;
            ++i;
        }
        System.out.println("Sum is "+s);
    }
}

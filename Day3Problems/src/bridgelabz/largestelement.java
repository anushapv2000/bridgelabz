package bridgelabz;

import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items to be entered");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for (int i=0;i<a.length;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximum value is "+max);
    }
}
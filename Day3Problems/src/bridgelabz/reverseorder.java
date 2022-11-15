package bridgelabz;

import java.util.Scanner;

public class reverseorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items to be entered");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}

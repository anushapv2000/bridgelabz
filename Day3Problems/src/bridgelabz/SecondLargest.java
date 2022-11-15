package bridgelabz;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items to be entered");
        int n = sc.nextInt();
        int t = 0;
        int a[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println("Second largest elemtn is "+a[a.length-2]);
    }
}
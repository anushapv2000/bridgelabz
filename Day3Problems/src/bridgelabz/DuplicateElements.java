package bridgelabz;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items to be entered");
        int n = sc.nextInt();
        boolean visit[] = new boolean[n];

        int c = 0;
        int a[] = new int[n];
        System.out.println("Enter the values");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            c = 1;
            if (visit[i] != true) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.println("duplicate= " + a[i]);
                    }
                    visit[j] = true;

                }
            }
        }
    }
}



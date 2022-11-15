package bridgelabz;

import java.util.Scanner;

public class freqencyElement {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of items to be entered");
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean visit[] = new boolean[n];

        int c=0;
        System.out.println("Enter the values");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++)
        {c=1;
            if (visit[i]!=true) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        visit[j] = true;
                        c = c + 1;
                    }
                }
                System.out.println(a[i] + " " + c);
            }
        }

    }
}

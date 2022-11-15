package bridgelabz.OperatorPrograms;

import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("Enter number 3");
        int c = sc.nextInt();
        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;
        int op4 = a * b + c;
        int max = op1;
        int min = op1;
        int[] arr = new int[4];
        arr[0] = op1;
        arr[1] = op2;
        arr[2] = op3;
        arr[3] = op4;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (max < arr[i])
                max = arr[i];
            else if (min > arr[i])
                min = arr[i];
        }
        System.out.println("max is "+max);
        System.out.println("min is "+min);
    }
}
package bridgelabz.Switch;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an alphabet");
        String str=sc.next();
        switch (str.toLowerCase()){
            case "a":
                System.out.println(str+" is a vowel");
                break;
            case "e":
                System.out.println(str+" is a vowel");
                break;
            case "i":
                System.out.println(str+" is a vowel");
                break;
            case "o":
                System.out.println(str+" is a vowel");
                break;
            case "u":
                System.out.println(str+" is a vowel");
                break;
            default:
                char st=str.toLowerCase().charAt(0);
                if (st >= 'a' && st <= 'z') {
                    System.out.println(str + " is a consonant");
                }
                else
                {
                    System.out.println("not a character");
                }
        }

    }
}

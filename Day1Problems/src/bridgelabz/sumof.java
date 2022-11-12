package bridgelabz;



public class sumof
{
 public static void main(String args[])
 {int s=0;
     int c=0;


     for(int i=0;i< args.length;i++){

       try {
           s = s + Integer.parseInt(args[i]);
       }
       catch (java.lang.NumberFormatException ex){
           c=c+1;
       }
     }

     System.out.println("Sum of the two numbers is "+s);
     System.out.println("count of invalid integers"+c);
 }
}

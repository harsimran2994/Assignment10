
package random;
import java.util.Scanner;
import java.util.Random;
public class Assign21 {
     public static void main(String[] args) {
    int number=0;
    int rnumber;
    int guess=0;
      Scanner sc = new Scanner(System.in);
       Random obj = new Random();
        rnumber= obj.nextInt(10);
         System.out.println("*******************");
         System.out.println("Welcome to the Guessing Game");
         System.out.println("*******************");
        while(number!=rnumber) {
            System.out.println("Enter the number from 1 to 10:");
            number=sc.nextInt();
          guess++;
             if(number==rnumber){
                 System.out.println("You won! The number was:"+rnumber);
                 
             }
             else{
               System.out.println("Try again");}
        }
         System.out.println("It took you "+guess+" guesses to win");
         
}
}

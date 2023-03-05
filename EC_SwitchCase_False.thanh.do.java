 

import java.util.Scanner;

 class main {
     public static void main(String[] args) {
         int number;
         
         Scanner input = new Scanner(System.in);
        
         System.out.println ("Enter a number from 1 to 3");
         
         number = input.nextInt();  
         
         switch (true) {
            case (number == 1):
               System.out.println ("Your inputted number is " + number);
               break;
            case (number == 2):
               System.out.println ("Your inputted number is " + number);
               break;
            case (number == 3):
               System.out.println ("Your inputted number is " + number);
               break;
            default:
               System.out.println ("Your input is invalid");
         }
               
         switch (false) {
            case (number != 1):
               System.out.println ("Your inputted number is " + number);
               break;

            case (number != 2):
               System.out.println ("Your inputted number is " + number);
               break;

            case (number != 3):
               System.out.println ("Your inputted number is " + number);
               break;

            default:
               System.out.println ("Your input is invalid");
         }
     } 
}        

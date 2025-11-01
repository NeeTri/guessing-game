import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame{
     
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
          
     NumberOutOfBoundsException problem = new NumberOutOfBoundsException("Number out of range from 1 to 100, please try again. Your guesses have not been affected.");
      
      int count = 0;
      
      int user_num = 0;
      
      int actualnum = ((int)(Math.random() * 100) + 1);
      
      System.out.println("Welcome to Neel Tripathi's guessing game! You get 10 chances to guess a random number from 1 to 100. Good luck!");
      
      while(count < 10){
         
         System.out.println("What's your guess?:");
         try{
         user_num = scan.nextInt();
         
          
         if(user_num<1){
         
             count = count - 1;
            
            throw problem;
            
           
        
        }
        
        if(user_num > 100){
        
          count = count - 1;
         
         throw problem;
         
         
       }
     }
         
       catch(NumberOutOfBoundsException e){
       
       System.out.println(e);
       }  
       
       catch(InputMismatchException g){
       
       System.out.println("Your answer contained letters or unidentifiable characters. Please try again. Your guesses have not been affected. ");
       
       scan.nextLine();
       
       count = count - 1;
       
              
       }
         
         
         if (user_num == actualnum){
            System.out.println("You guessed the number! Congraulatious!");
            break;
         }
            System.out.println("That's not it, but keep trying!");
            
            int remaining = 10 - (count + 1);
            
            System.out.println("You have " + remaining + " remaining guesses.");
            
            count++;
       }
       
         if(count == 10){
         
         System.out.println("Game over. The correct number was " + actualnum);
         
         }
      
   }
}
            
      
      
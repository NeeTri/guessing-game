import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame{
     
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
          
     NumberOutOfBoundsException problem = new NumberOutOfBoundsException("Number out of range from 1 to 100, please try again. Your guesses have not been affected.");
      
      int count = 0;
      
      int user_num = 0;
      
      int actualnum = ((int)(Math.random() * 100) + 1);
      
      System.out.println("Welcome to the guessing game! You get 5 chances to guess a random number from 1 to 100. Good luck!");
      
      while(count < 5 ){

         boolean again = true;
         
         System.out.println("\n" +"What's your guess?:");
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
       
       System.out.println("\n" +"Your answer contained letters or unidentifiable characters. Please try again. Your guesses have not been affected. ");
       
       scan.nextLine();
       
       count = count - 1;
       
              
       }
         
         
         if (user_num == actualnum){
            System.out.println("\n" + "You guessed the number! Congraulatious!");
            break;
         }
   
            
            int remaining = 5 - (count + 1);
           
            if(remaining == 0){

         System.out.println("\n" + "You have " + remaining + " remaining guesses.");
         
         System.out.println("\n" + "Game over. The correct number was " + actualnum);

         System.out.println("\n" + "That was a good try. But I know you can do better! Give it another try!");

         break;

            }
            
            else{
            System.out.println("\n" +"That's not it, but keep trying!");

            System.out.println("\n" + "You have " + remaining + " remaining guesses.");
            
            count++;
            }
         }
         System.out.println("\n" + "If you want to play again, just rerun the program." + "\n");
       }
       
   
   }
            
      
      

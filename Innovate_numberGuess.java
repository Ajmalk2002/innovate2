import java.util.*;
import java.util.Scanner;

public class Innovate_numberGuess {
    
    public static void main(String[] args) {
        System.out.println("Let's play a game.... I'll pick a number between");
        System.out.println("1 to 100, and you try to guess it correctly.");
        Scanner sc = new Scanner(System.in); 
        
        boolean playAgain;
        
        do {
            playGame();  
            
            System.out.println("Would you like to play again? Y/N");
            String playAgainStr = sc.next();
            playAgain = playAgainStr.equalsIgnoreCase("Y");
        } while (playAgain);
        System.out.println("Thanks for playing. Goodbye.");
    }
    
    static void playGame() {
        int computersNumber; 
        int usersGuess;      
        int guessCount;    
        computersNumber = (int)(100 * Math.random()) + 1;
        guessCount = 0;
        
        System.out.println();
        System.out.println("What is your first guess?");
        Scanner sc1= new Scanner(System.in);   
        
        while (true) {
            usersGuess = sc1.nextInt(); 
            guessCount++;
            
            if (usersGuess == computersNumber) {
                System.out.println(" Congrats!..., You got it in " + guessCount + " guesses! My number was " + computersNumber);
                break;  
            }
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;  
            }
            if (usersGuess < computersNumber) {
                System.out.println("Your number is too low. Try again:");
            }
            
            else if (usersGuess > computersNumber) {
                System.out.println("Your number is too high. Try again:");
            }
        }
        
        System.out.println();
    } 
}
import java.util.*;

public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int MaxNumber = 100;
        int MinNumber = 1;
        int MaxAttempts = 5;
        int Range = MaxNumber - MinNumber + 1;

        Boolean Play = true;

        while(Play==true){
            int GeneratedNumber = (int)(Math.random() * Range) + MinNumber;
            boolean NotGuessedCorrectly = true;
            int score = 0;
            System.out.println();
            System.out.println("Welcome to Number Guessing Game!!");
            System.out.println();
            System.out.println("You must choose a number between 1 and 100 by guessing it from a set of randomly generated numbers.");
            System.out.println();
            System.out.println("If you guess a number larger than the one that is generated, it will appear too high, and if you guess a number smaller than the one that is generated, it will appear too low.");
            System.out.println();
            for(int i=MaxAttempts; i>0; i--){
                System.out.print("Guess the number : ");
                int UserGuess = sc.nextInt();

                if(UserGuess < GeneratedNumber){
                    System.out.println("Too low!!");
                    System.out.println();
                }
                else if(UserGuess > GeneratedNumber){
                    System.out.println("Too high!!");
                    System.out.println();
                }
                else{
                    score = i*20;
                    System.out.println();
                    System.out.println("Congralutions!! You have guessed the corect number.");
                    System.out.println("Your score is " + score);
                    System.out.println();
                    NotGuessedCorrectly = false;
                }
            }
            
            if(NotGuessedCorrectly == true){
                System.out.println("Game Over! You ran out of attempts.");
                System.out.println("The correct number was : " + GeneratedNumber);
                System.out.println();
                System.out.println("Your score is " + score);
            }
            System.out.println();
            System.out.print("Do you want to play again? (yes/no) : ");
            System.out.println();
            String WillingToPlay = sc.next();

            if(WillingToPlay.equalsIgnoreCase("no")){
                Play = false;
                System.out.println();
                System.out.println("Thankyou for playing the Number Guessing Game.");
            }
        }
    }  
}

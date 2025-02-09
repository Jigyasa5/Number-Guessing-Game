import java.util.*;

public class NumberGuess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0 ; 
        boolean playAgain;

        System.out.println("Welcome to Number Guessing Game !!");

        do{
            int targetNum = random.nextInt(100) + 1;
            int AttemptLeft = 5;
            boolean guessedCorrectly = false;

            System.out.println("I have guessed a number between 1 to 100");
            System.out.println("You have " + AttemptLeft + " attempts left to guess.");

            while(AttemptLeft > 0 ){
                System.out.println("Enter your guess:");
                int guess = sc.nextInt();
                AttemptLeft--;

                if(guess > targetNum){
                    System.out.println("Too high! Attempts left:" + AttemptLeft);
                }
                else if(guess < targetNum){
                    System.out.println("Too low! Attempts left:" + AttemptLeft);
                }
                else{
                    System.out.println("Congratulations! you guessed correctly.");
                    score++;
                    guessedCorrectly = true;
                    break;
                }
            }

            if(!guessedCorrectly){
                System.out.println("You've used all attempts! The correct number was: " + targetNum);
            }
    
            System.out.println("Your Total Score: " + score);
    
            System.out.print("Do you want to play again? (Yes/No): ");
            playAgain = sc.next().equalsIgnoreCase("Yes");
        }

        


        while(playAgain);
            System.out.println("Thank you for playing! Your final score:" + score);
            sc.close();
        


    }
}
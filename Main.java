import java.util.Random;
import java.util.Scanner;

public class Main{
static int randomNumber;
static int userGuess;

static int userAttempts = 0;

    public static void main(String[] args) {
        welcome();
        chooseNum();
        guessNum();
        lowerOrHigher();
        statistics();
    }
    
    public static void welcome(){
        System.out.println("Welcome to the number guessing game");
        System.out.println("I am going to pick number 1 - 100 and you have to guess in the least amount of tries");
        System.out.println("Ready to Play?");
        System.out.println("Okay thinking of a number...");
        System.out.println("Okay I got it, take your guess");
    }

    public static void chooseNum(){
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);
    }

    public static void guessNum(){
        Scanner scanner = new Scanner(System.in);
        userGuess = scanner.nextInt();
    }


    public static void lowerOrHigher(){
        while (userGuess != randomNumber) {
            
            if (userGuess < randomNumber) {
                System.out.println("Higher");
                userAttempts++;
            } 
            
            else if (userGuess > randomNumber){
                System.out.println("Lower");
                userAttempts++;
            }
            
            guessNum(); // Added to get the next guess from the user
        }
        
        System.out.println("You got it!!!");
        userAttempts++;
        
    }

    public static void statistics(){
        System.out.println("You made " + userAttempts + " attempts");
    }

   
}


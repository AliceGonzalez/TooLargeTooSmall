import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
//    Write a guessing game which prompts a user to guess a mystery number within some range.
//    After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//    Upon termination, the program should display the number of guesses before successfully guessing correctly.
//    A number that is input consecutively, should register as a single guess.
//    To establish familiarity with
//    Control Flow
//    Conditionals
//    User input
//    The Random class
//    Object instantation/declaration
//    Method invokation

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Creates scanner obj
        System.out.println("Welcome!\nGuess a number from 1 - 10!");

        int secretNumber = (int) (Math.random() * 10) + 1; //Created a random number
        int counter = 0;

        while (true){
            int userGuess = Integer.parseInt(input.nextLine()); //Reads user input

            if (userGuess > secretNumber){
                counter++;
            System.out.println("Your guess is too large. Try again!");
            }else if (userGuess < secretNumber){
                counter++;
                System.out.println("Your guess is too small. Try again!");
            }else{
                System.out.println("Congratulations!\nYou guessed the secret number after " + counter + " tries !");
                break;
            }
        }
    }
}

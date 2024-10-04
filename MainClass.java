package se.sara.dicegame;

import java.util.Scanner;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Hi and welcome to the Dice Game!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name?");
        String player1Name = scanner.nextLine();
        System.out.println("What is your level? Please input one number between 1-5.");
        int player1Level = scanner.nextInt();
        Players player1 = new Players(player1Name, player1Level);



        if (player1Level < 3) {
            System.out.println("Hi " + player1Name + ". You are a beginner. Please press ENTER to roll the dice.");
            scanner.nextLine();
        } else if (player1Level < 6) {
            System.out.println("Hi " + player1Name + ". You are an expert. Please press ENTER to roll the dice.");
            scanner.nextLine();
        } else {
            System.out.println("You entered the wrong number, please try again.");
            scanner.nextLine();
        }


        Random random = new Random();
        scanner.nextLine();
        int roll1 = random.nextInt(6) + 1;
        System.out.println("You roll " + roll1 + ". You have one more chance. Press ENTER again.");

        scanner.nextLine();

        int roll2 = random.nextInt(6) + 1;
        int sum = roll1 + roll2;
        System.out.println("You roll " + roll2 + ". Your total score is " + sum);

        System.out.println("Player 2 its your turn.");
        System.out.println("Please enter your name and your level.");

        String player2Name = scanner.nextLine();
        int player2Level = scanner.nextInt();
        Players player2 = new Players(player2Name, player2Level);

        if (player2Level < 3) {
            System.out.println("Hi " + player2Name + ". You are a beginner. Please press ENTER to roll the dice.");
            scanner.nextLine();
        } else if (player2Level < 6) {
            System.out.println("Hi " + player2Name + ". You are an expert. Please press ENTER to roll the dice.");
            scanner.nextLine();
        } else {
            System.out.println("You entered the wrong number, please try again.");
            scanner.nextLine();
        }

        scanner.nextLine();
        int roll3 = random.nextInt(6) + 1;
        System.out.println("You roll " + roll1 + ". You have one more chance. Press ENTER again.");

        scanner.nextLine();

        int roll4 = random.nextInt(6) + 1;
        int sum2 = roll3 + roll4;
        System.out.println("You roll " + roll2 + ". Your total score is " + sum2);

        if (sum > sum2){
            System.out.println(player1Name + " you win!");
        }
        else if (sum < sum2){
            System.out.println(player2Name + " you win!");
        }
        else {
            System.out.println("It's a tie, let's play again.");
        }



    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        while(true) {
            playOnce(s);

            System.out.println("Wanna play again? (y/n)");
            String playResponse = s.next();

            if(playResponse.equalsIgnoreCase("y")) {
                System.out.println("----------------------------");

            } else {
                System.out.println("Thank you for playing!");
                return;
            }
        }


    }


    public static void playOnce(Scanner s) {
        // 1 - 100
        int atsakymas = (int) (Math.random() * 100) + 1;


        System.out.println("Hello! Welcome to a guessing game.\nGuess the number and you win :))\nHow many tries do you need?");
        int limitas = s.nextInt();

        System.out.println("Enter a number 1-100:");

        int spejimuKiekis = 0;
        while(spejimuKiekis < limitas) {

            System.out.println("You have " + (limitas - spejimuKiekis) + " attempts left");

            int spejimas = s.nextInt();
            spejimuKiekis++;

            if(spejimas > atsakymas) {
                System.out.println("Guess less");
            } else if(spejimas < atsakymas) {
                System.out.println("Guess more");
            } else {
                System.out.println("Correct! You win");
                return;
            }

        }
        System.out.println("You lose!");
    }



}
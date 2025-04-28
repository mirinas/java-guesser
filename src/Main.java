import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1 - 100
        int atsakymas = (int) (Math.random() * 100) + 1;
        Scanner s = new Scanner(System.in);

        System.out.println("Hello! Welcome to a guessing game.\nGuess the number and you win :))\nHow many tries do you need?");
        int limitas = s.nextInt();

        System.out.println("Enter a number 1-100:");

        int spejimuKiekis = 0;
        while(spejimuKiekis < limitas) {

            System.out.println("You have " + (limitas - spejimuKiekis) + " attempts left");

            int spejimas = s.nextInt();
            spejimuKiekis++;
//            spejimuKiekis += 1;
//            spejimuKiekis = spejimuKiekis + 1;

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


        // 1. perskaitom naudotojo spejima
        // 2. jeigu spejimas didesnis nei turi buti
        //      rasom "spek mazesni skaiciu"
        //      else rasom "spek didesni skaiciu"
        //         griztam i pirma zingsni

        // 3. jei nei didesnis, nei mazesnis - naudotojas pataike!
        // 4. parasom sekmes zinute



        // BONUS:
        // 1. isijungus programa, naudotojas lazinasi is kiek kartu
        //      atspes skaiciu
        // 2. jeigu naudotojas virsija spejimu kieki, uzdarom programa
        // 3. rasom pralaimejai
        // 4. pries kiekviena spejima rasom kiek liko bandymu
    }
}
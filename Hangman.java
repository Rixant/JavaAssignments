import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static String word = readFileAsString();
    private static String secret = new String(new char[word.length()]).replace("\0", "-");
    private static int counter = 0;


    public static String readFileAsString() {
        Scanner file = null;
        try {
            file = new Scanner(new FileInputStream("resources/Phrases.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] word = new String[20];

        for(int i=0;i<20;i++){
            word[i]=file.nextLine();

        }
        String secretWord=word[Rand()];


        return(secretWord);


    }


    public static int Rand() {
        Random input = new Random();
        int num = input.nextInt(20);
        return num;

    }


    public static void Turn(String guess) {
        String secretWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                secretWord += guess.charAt(0);
            } else if (secret.charAt(i) != '-') {
                secretWord += word.charAt(i);
            } else {
                secretWord += "-";
            }
        }

        if (secret.equals(secretWord)) {
            counter++;
            EndGame();
        } else {
            secret = secretWord;
        }
        if (secret.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void EndGame() {
        if (counter == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|______     ");
            System.out.println("You have "+(10-counter)+" tries remaining");

        }
        if (counter == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("___|______  ");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("  __");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("   |        ");
            System.out.println("___|______  ");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |            ");
            System.out.println("   |            ");
            System.out.println("   |            ");
            System.out.println("   |            ");
            System.out.println("___|_______     ");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ______________");
            System.out.println("   |          _|_ ");
            System.out.println("   |              ");
            System.out.println("   |              ");
            System.out.println("   |              ");
            System.out.println("   |              ");
            System.out.println("   |              ");
            System.out.println("   |              ");
            System.out.println("___|______        ");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          ");
            System.out.println("   |          ");
            System.out.println("   |");
            System.out.println("___|___");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 7) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /    \\");
            System.out.println("   |        | 0  0 |");
            System.out.println("   |         \\_^_ /");
            System.out.println("   |                ");
            System.out.println("   |                 ");
            System.out.println("   |                 ");
            System.out.println("___|_______         ");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 8) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /    \\");
            System.out.println("   |        | 0  0 |");
            System.out.println("   |         \\_^_ /");
            System.out.println("   |           |   ");
            System.out.println("   |           |   ");
            System.out.println("   |               ");
            System.out.println("___|___            ");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 9) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /    \\");
            System.out.println("   |        | 0  0 |");
            System.out.println("   |         \\_^_ /");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
        if (counter == 10) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /    \\");
            System.out.println("   |        | 0  0 |");
            System.out.println("   |         \\_^_ /");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
            System.out.println("You have "+(10-counter)+" tries remaining");
        }
    }

    public static boolean Play() {
        Scanner input = new Scanner(System.in);
        String Answer = input.nextLine();
        if (Answer.equalsIgnoreCase("y")) {
            boolean test = true;
            return test;
        } else {
            boolean test = false;
            return test;
        }
    }



        public static void main(String[] args) {
            System.out.println("Would you like to play game? Y/N");
            boolean c=Play();
            while(c==true){
                Scanner input = new Scanner(System.in);
                    while (counter < 10 && secret.contains("-")) {
                        System.out.println("Guess any letter in the word");
                        System.out.println(secret);
                        String guess = input.nextLine();
                        Turn(guess.toLowerCase());

                    }
//                    System.out.println("********************************");
//                    System.out.println("Would you like keep playing? Y/N");
//                    c =Play();
                } }
}
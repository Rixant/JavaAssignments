package games;
import java.util.*;
import java.io.*;

public class Hangman {

    public static final String word=readFileAsString();
    public static String secret = new String(new char[word.length()]).replace("\0", "_");
    public static StringBuilder guess;
    public static int misses;
    public static char[][]board=new char[7][7];

    public static void InitializeBoard()
    {
        for (int i=0; i<7; i++)
        {
            for (int j=0; j<7; j++)
                board[i][j]=' ';
        }
        for (int j=0; j<=4; j++)
            board[0][j]='-';
        for (int i=1; i<=6; i++)
            board[i][0]='|';
        board[1][4]='|';
    }

    public static void PrintBoard()
    {
        for (int i=0; i<7; i++)
        {
            for (int j=0; j<7; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

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


    public static void Guess(char l, StringBuilder g)
 
    {
        boolean correct=false;
        for (int i=0; i<word.length(); i++)
        {
            if (l==word.charAt(i))
            {
                g.setCharAt(i, l);
                correct=true;
                System.out.println("Good! "+l+" exists in the word");
            }
        }
        if (correct==false)
            misses++;
        System.out.println("Wrong guess. Please try another");
        System.out.println("You have "+(10-misses)+" tries remaining");
            Redraw();
    }

    public static void Redraw()

    {
        if (misses==1)
        {
            board[2][3]='(';
        }
        if (misses==2)
        {
            board[2][5]=')';
        }
        if (misses==3)
        {
            board[3][3]='/';
        }
        if (misses==4)
        {
            board[3][4]='|';
        }
        if (misses==5)
        {
        board[3][5]='\\';
        }
        if (misses==6)
        {
            board[4][4]='|';
        }
        if (misses==7)
        {
            board[5][3]='|';
        }
        if (misses==8)
        {
            board[5][5]='|';
        }
        if (misses==9)
        {
            board[6][2]='_';
        }
        if (misses==10)
        {
            board[6][6]='_';
        }
    }

    public static boolean GameOver(int misses)
    {
        if (misses==10)
        {
            System.out.println("You Lose!!");
            return true;
        }
        else if (guess.indexOf("_")<0)
        {
            System.out.println(" CONGRATULATIONS !!! Great Game !! You Win!");
            return true;
        }
        return false;
    }

    public static void PrintWord(StringBuilder s)
    {
        System.out.println(s);
    }

    public static void main (String []args)
    {
        InitializeBoard();
        PrintBoard();
        guess= new StringBuilder(secret);

        misses=0;
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Guess a character in the "+(guess.length())+" character word!");
        System.out.println(guess);
        while (GameOver(misses)==false)
        {

            System.out.print("Enter your guess!");
            char letter=keyboard.next().charAt(0);
            Guess(letter, guess);
            PrintBoard();
            PrintWord(guess);
        }
    }
}
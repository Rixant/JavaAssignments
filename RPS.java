
import java.util.*;

public class RPS{
    public static void main(String[] args) {

        Game();

    }

    public static  String Computer(){
        Random Randint=new Random();
        int G=Randint.nextInt(3);
        if(G==0)
            return "Rock";
        else if (G==1)
            return "Paper";
        else
            return "Scissor";
    }

    public static String userInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Rock/Scissor/Paper");
        String Answer=input.nextLine();
        return Answer;
    }

    public static void Round(){
        String User=userInput();
        String Com=Computer();
        System.out.println("********************************");
        System.out.println("Computer chose "+Com);


        if(User.equalsIgnoreCase("Scissor")){
            if(Com.equals("Scissor"))
                System.out.println("Tie");
            else if(Com.equalsIgnoreCase("Rock"))
                System.out.println("Computer wins");
            else
                System.out.println("You win");

        }

        else if(User.equalsIgnoreCase("Rock")){
            if(Com.equalsIgnoreCase("Rock"))
                System.out.println("Tie");
            else if(Com.equalsIgnoreCase("Paper"))
                System.out.println("Computer wins");
            else
                System.out.println("You win");

        }

        else if(User.equalsIgnoreCase("Paper")) {
            if(Com.equalsIgnoreCase("Paper"))
                System.out.println("Tie");
            else if(Com.equalsIgnoreCase("Scissor"))
                System.out.println("Computer wins");
            else
                System.out.println("You win");

        }

        else
            System.out.println("Not a valid Entry");
    }

    public static boolean rePlay(){
        Scanner input=new Scanner(System.in);
        String Answer=input.nextLine();
        if(Answer.equalsIgnoreCase("y")){
            boolean test=true;
            return test;
        }
        else{
            boolean test=false;
            return test;
        }



    }


    public static void Game(){
        System.out.println("Would you like to play the game? Y/N");
        boolean c=rePlay();
        while(c==true){
            System.out.println("Calling Round");
            Round();
            System.out.println("********************************");
            System.out.println("Would you like keep playing? Y/N");
            c=rePlay();



        }


    }




}
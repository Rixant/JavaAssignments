import java.util.Scanner;

public class Wages {
        public static void main(String[] args)
        {
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Enter your first name= ");
            String FirstName=keyboard.nextLine();
            System.out.println("Enter your last name= ");
            String LastName=keyboard.nextLine();
            System.out.println("Enter the number of hours you worked=");
            Float H=keyboard.nextFloat();
            System.out.println("Enter your hourly rate=");
            Float R=keyboard.nextFloat();
            System.out.println("My name is "+FirstName+" "+LastName+".");
            System.out.println("Total Income of " +FirstName+" "+LastName+ "'s is $"+ H*R);
        }

}

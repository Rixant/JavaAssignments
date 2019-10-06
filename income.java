public class income

public static void main(String[] args) {
      int Income, Tax;
      Scanner keyboard=new Scanner(System.in);

              System.out.println("Input your Income=");
               Income=keyboard.nextInt();
               if (Income < 0);{
                  System.out.println("Invalid");
                else if (Income < 15000){
                Tax=0;
                  System.out.println("You are not charged Tax");}
               else if (Income > 15000 && Income < 30000){
                  Tax= (5/100)*Income;
                  System.out.println("Your tax is"+Tax);}
               else if (Income > 30000){
                  Tax=(10/100)*Income;
                  System.out.println("Your Tax is"+Tax);}

        }


              }

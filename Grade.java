import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        double Score;

        Scanner input =new Scanner(System.in);
        Score=input.nextDouble();
        System.out.println("Enter your Score:");
        if ((Score >= 90) && (Score <= 100)) {
            System.out.println("A");
        } else if ((Score >= 80) && (Score < 90)) {
            System.out.println("B");
        }
          else if ((Score >=70) && (Score < 60)) {
              System.out.println("C");
        }
          else {
            System.out.println("F");
        }
    }
}

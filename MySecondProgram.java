import java.util.*;

public class MySecondProgram
{
public static void main(String[] args)
{
System.out.println("Enter two whole number separated with space:");
int n1, n2;
Scanner keyboard=new Scanner(System.in);
n1=keyboard.nextInt();
n2=keyboard.nextInt();
System.out.println("Sum is:");
System.out.println(n1+n2);
System.out.println("Difference is:");
System.out.println(n1-n2);
System.out.println("Product is:");
System.out.println(n1*n2);
System.out.println("Quotient is:");
System.out.println(n1/n2);
System.out.println("Remainder is:");
System.out.println(n1%n2);
}
}
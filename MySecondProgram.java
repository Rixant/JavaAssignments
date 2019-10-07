import java.util.*;

public class MySecondProgram
{
public static void main(String[] args)
{
int n1, n2;
Scanner input=new Scanner(System.in);
System.out.println("Enter biggest number= ");
n1=input.nextInt();
System.out.println("Enter smallest number= ");
n2=input.nextInt();
System.out.println("Sum is= "+(n1+n2));
System.out.println("Difference is= "+(n1-n2));
System.out.println("Product is= "+(n1*n2));
System.out.println("Quotient is= "+(n1/n2));
System.out.println("Remainder is= "+(n1%n2));

}
}

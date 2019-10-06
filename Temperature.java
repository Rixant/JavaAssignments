import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        System.out.println("Input the temperature in Fahrenheit(F)=");
        Scanner Fahrenheit=new Scanner(System.in);
        Float F=Fahrenheit.nextFloat();
        Float C=(F-32)*5/9;
        System.out.println(F+" Fahrenheit is equal to "+ C+" Celsius");
    }
}
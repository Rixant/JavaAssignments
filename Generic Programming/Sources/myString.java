package Generic;
import java.util.*;
import java.lang.*;

public class myString  implements Comparable <myString> {
    public String String1;

    public myString(String S) {
        this.String1 = S;
    }


    public int compareTo(myString other) {
        int result=-2;
        if (this.String1.equals(other.String1)) {
            result = 0;
            return result;
        } else {

            for (int i = 0; i < this.String1.length() &&
                    i < other.String1.length(); i++) {
                if ((int) this.String1.charAt(i) ==
                        (int) other.String1.charAt(i)) {
                    continue;
                } else {
                    result = (int) this.String1.charAt(i) -
                            (int) other.String1.charAt(i);
                    return result;
                }
            }

            // compares fanta and fantastic
            if (this.String1.length() < other.String1.length()) {
                result = (this.String1.length() - other.String1.length());
                return result;
            } else if (this.String1.length() > other.String1.length()) {
                result = (this.String1.length() - other.String1.length());
                return result;
            } else
                return 0;

        }

    }

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        myString r1=new myString(keyboard.next());
        myString r2=new myString(keyboard.next());
        int result=r1.compareTo(r2);
        System.out.println(result);
    }

}





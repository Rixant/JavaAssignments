package Serial;
import java.util.*;
import java.io.*;

public class Driver {

    static Employee[] list = new Employee[5];


    public Driver(String filename) {
        Scanner file = null;
        try {
            file = new Scanner(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        String line;
        for (int k = 0; k < 5; k++) {
            line = file.nextLine();
            String[] s = line.split("\t+");
            String name = s[0];
            String a = s[1];
            int SS = Integer.parseInt(s[2]);
            int i = Integer.parseInt(s[3]);
            list[k] = new Employee(name, a, SS, i);
        }

    }

    public void Print(Employee[] list) {

        for (int j = 0; j < 5; j++) {
            System.out.printf("Name: %s\n", list[j].name);
            System.out.printf("Address: %s\n", list[j].address);
            System.out.printf("SSN: %s\n", list[j].SSN);
            System.out.printf("ID: %s\n", list[j].ID);
            System.out.println("**********************************");
        }
    }
    public static void main(String[] args) {
        Driver L=new Driver("resources/employeelist.txt");
        L.Print(list);
    }
}

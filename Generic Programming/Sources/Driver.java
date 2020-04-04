package Generic;
import java.util.*;
import java.io.*;

public class Driver
{
    myString[] words=new myString[5];

    public Driver()
    {
        Scanner file=null;
        try
        {
            file=new Scanner(new FileInputStream("resources/Dictionary.txt"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(0);
        }
        String line;
        for (int i=0;i<5;i++)
        {
            line=file.nextLine();
            words[i]=new myString(line);

        }
    }

    //Print the Strings
    void Print()
    {
        for (int k=0; k<5; k++){
            System.out.println(words[k].String1);
        }
    }

    //main function
    public static void main(String []args)
    {
        System.out.println("Before sorting Data:");
        Driver Generic=new Driver();
        Generic.Print();
        System.out.println("***********************************");

        System.out.println("After sorting Data:");
        Algorithms.QuickSort(Generic.words, 0, 4);
        Generic.Print();


    }
}


import java.io.FileInputStream;
import java.lang.*;
import java.io.*;
import java.nio.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
public class Winner{
    public static void main(String[] args) {
        Scanner file=null;
        FileOutputStream outfile=null;
        PrintStream writer=null;
        try{
            file=new Scanner(new FileInputStream("resources/contestants.txt"));
            outfile=new FileOutputStream("resources/output2.txt");
            writer= new PrintStream(outfile);
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(0);

        }

        Random num=new Random();
        int w1=num.nextInt(10);
        int w2=num.nextInt(10);
        int w3=num.nextInt(10);
        do{
            w1=num.nextInt(10);
            w2=num.nextInt(10);
            w3=num.nextInt(10);
        }
        while((w1==w2)||(w2==w3)||(w1==w3));

        String[] names=new String[10];
        for (int i=0;i<10;i++){
            names[i]=file.nextLine();
        }

        System.out.printf("The randomly selected winning contestant are %s , %s , %s ",names[w1],names[w2], names[w3]);
        writer.println(names[w1]);
        writer.println(names[w2]);
        writer.println(names[w3]);


    }

}
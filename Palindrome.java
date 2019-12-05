import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.nio.*;
import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner file=null;
        FileOutputStream outfile=null;
        PrintStream writer=null;
        try{
            file=new Scanner(new FileInputStream("resources/Palindrome.txt"));
            outfile=new FileOutputStream("resources/output.txt");
            writer= new PrintStream(outfile);
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(0);
        }

        String[] word=new String[15];

        for(int i=0; i<15;i++){
            word[i]=file.nextLine();
            String Palword=word[i];
            String newWord="";
            int len=Palword.length();

            for(int j=len-1;j>=0;j--){
                char a=Palword.charAt(j);
                newWord+=a;
                newWord=newWord.toUpperCase();
            }

            if(newWord.equalsIgnoreCase(Palword)) {
                System.out.println(newWord);
                writer.println(newWord);
            }
                

        }

}}

package Hash;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Hash
{
    Hashtable<String, String> h;


    int size;
    int boxsize1, boxsize2;

    public Hash(String filename)
    {
        h=new Hashtable<String, String>();
        size=0;

        Scanner file=null;
        try{
            file=new Scanner(new FileInputStream(filename));
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            System.exit(0);

        }
        String line;
        String[] fields=new String[2];
        String[][] elements=new String[5][2];
        for (int k=0;k<5;k++) {
            line = file.nextLine();
            elements[k] = line.split("\t+");
//            System.out.println(elements[k][0]);
//            System.out.println(elements[k][0]);
            h.put(elements[k][0], elements[k][1]);
            size++;
            boxsize1=elements[k][0].length();
            boxsize2=elements[k][1].length();
            boxsize2=Math.max(boxsize2,size)+10;

        }
    }



    public void Print() {
        
	System.out.println("-----------------------------------------");
        for (String key : h.keySet()) {
		
          
            System.out.printf("|%" + -boxsize1 + "s" + "|%" +boxsize2 +"s|", key, h.get(key));
            System.out.println();
            for (int i = 0; i < (boxsize1+boxsize2+3); i++) {
                System.out.print("-");



            }
            System.out.println();

        }
    }
    public static void main(String []args)
    {
        Hash myHash=new Hash("resources/codes.txt");
        myHash.Print();

    }
}

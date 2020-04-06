package Cards;
import java.util.*;

public class Card implements Comparable<Card>
{
    int rank;
    String suite;

    public Card()
    {
    }

    public Card(int r, String s)
    {
        rank=r;
        suite=s;
    }


    public Card(String r, String s)
    {
        suite=s;
        switch (r)
        {
            case "A":
                rank=14;
                break;
            case "K":
                rank=13;
                break;
            case "Q":
                rank=12;
                break;
            case "J":
                rank=11;
                break;
            default:
                rank=Integer.parseInt(r);
                break;
        }
    }

    public boolean isHigher(Card other)
    {
        boolean ret=true;
        if (isHigher(this.suite, other.suite))
            ret=true;
        else if (this.suite.equals(other.suite))
        {
            if (this.rank>=other.rank)
                ret=true;
            else
                ret=false;
        }
        return ret;
    }



    public int compareTo(Card o)
    {
        if (this.rank == (o.rank))
            return 0;
        else if ((this.rank) > (o.rank))
            return 1;
        else
            return -1;
    }

    public static boolean isHigher(String s1, String s2)
    {
        boolean ret=true;
        switch (s1)
        {
            case "hearts":
                ret=true;
            case "spades":
                if (s2.equals("hearts"))
                    ret=false;
                else if (s2.equals("diamonds"))
                    ret=true;
                else if (s2.equals("clubs"))
                    ret=true;
            case "diamonds":
                if (s2.equals("hearts"))
                    ret=false;
                else if (s2.equals("spades"))
                    ret=false;
                else if (s2.equals("clubs"))
                    ret=true;
            case "clubs":
                ret=false;
        }
        return ret;
    }

    public void Print()
    {
        System.out.println("Rank: "+this.rank+" Suite: "+this.suite);
    }

    public static Card Read()
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter card: <face> <suit> ");
        String c=input.nextLine();
        String []arr=c.split("\\s+");
        Card card=new Card(arr[0], arr[1]);
        card.Print();
        return card;
    }

    public static void main(String []args)
    {
        Card card1=new Card(); card1=Read();
        Card card2=new Card(); card2=Read();
        if (card1.isHigher(card2))
            System.out.println("card1 > card2");
        else
            System.out.println("card2 > card1");
    }
}

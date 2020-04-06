package Cards;


public class Hand
{
    public static Card[] cards=new Card[5];

    public Hand()
    {
        for (int i=0; i<5; i++)
        {
            cards[i]=Card.Read();
        }
    }

    public boolean RoyalFlush()
    {
        boolean sameSuite=true;
        boolean it;
        boolean at=false;
        System.out.println("********Sorted Cards********");
        for (int i=0; i<4; i++)
        {


            Algorithms.QuickSort(cards, 0,4);

            System.out.println(cards[i].rank+" "+cards[i].suite);
            if(cards[i].rank<cards[i+1].rank)
                at=true;
            it=cards[i].suite.equals(cards[i+1].suite);
            // String s1=Integer.toString(cards[i].rank);
            // System.out.println(it);
            sameSuite=sameSuite&&it&& at;
            // System.out.println(sameSuite);
        }
        System.out.println(cards[4].rank+" "+cards[4].suite);
        return sameSuite;
    }

    public void PrintHand()
    {
        for (int i=0; i<5; i++)
        {
            this.cards[i].Print();
        }
    }

    public static void main(String []args)
    {
        Hand myHand=new Hand();
        Algorithms.QuickSort(myHand.cards,0,1);
        System.out.println("******************");
        myHand.PrintHand();
        if (myHand.RoyalFlush()==true)
        {
            System.out.println("**CONGRATULATIONS!!! YOU GOT ROYAL FLUSH.** ");
        }
        else{
            System.out.println("You lost. If you call or text this number, know that you will be treated with compassion" +
                    " and understanding. Reaching out for help signifies bravery and strength – not weakness. If you or a " +
                    "loved one struggle with problem gambling, we offer support, treatment, and hope.");
        }
    }
}

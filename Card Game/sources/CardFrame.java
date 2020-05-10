package Cards;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CardFrame extends JFrame {
    static Hand hand1=new Hand();
    static Card s1,s2,s3,s4,s5;


    public CardFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 600);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new GridLayout(1,5));

        JLabel winningHand = new JLabel("Your Hand");
        winningHand.setPreferredSize(new Dimension(this.getWidth(), 100));
        winningHand.setFont(new Font(winningHand.getFont().getName(), winningHand.getFont().getStyle(), 20));
        winningHand.setBorder(new LineBorder(Color.BLACK));

        s1=hand1.cards[0];
        String r1=s1.rank+" "+s1.suite;
        s2=hand1.cards[1];
        String r2=s2.rank+" "+s2.suite;
        s3=hand1.cards[2];
        String r3=s3.rank+" "+s3.suite;
        s4=hand1.cards[3];
        String r4=s4.rank+" "+s4.suite;
        s5=hand1.cards[4];
        String r5=s5.rank+" "+s5.suite;

        ImageIcon card1img = new ImageIcon(new ImageIcon("resources/" + r1+ ".png").getImage().getScaledInstance(200, 304, Image.SCALE_DEFAULT));
        ImageIcon card2img = new ImageIcon(new ImageIcon("resources/"+ r2 + ".png").getImage().getScaledInstance(200, 304, Image.SCALE_DEFAULT));
        ImageIcon card3img = new ImageIcon(new ImageIcon("resources/" + r3 + ".png").getImage().getScaledInstance(200, 304, Image.SCALE_DEFAULT));
        ImageIcon card4img = new ImageIcon(new ImageIcon("resources/" + r4 + ".png").getImage().getScaledInstance(200, 304, Image.SCALE_DEFAULT));
        ImageIcon card5img = new ImageIcon(new ImageIcon("resources/" + r5 + ".png").getImage().getScaledInstance(200, 304, Image.SCALE_DEFAULT));
        JLabel card1 = new JLabel(card1img);
        JLabel card2 = new JLabel(card2img);
        JLabel card3 = new JLabel(card3img);
        JLabel card4 = new JLabel(card4img);
        JLabel card5 = new JLabel(card5img);

        // draw label border to verify the new label size
        card1.setBorder(new LineBorder(Color.BLACK));
        card2.setBorder(new LineBorder(Color.BLACK));
        card3.setBorder(new LineBorder(Color.BLACK));
        card4.setBorder(new LineBorder(Color.BLACK));
        card5.setBorder(new LineBorder(Color.BLACK));

        // change label size
        card1.setPreferredSize(new Dimension(200, 304));
        card2.setPreferredSize(new Dimension(200, 304));
        card3.setPreferredSize(new Dimension(200, 304));
        card4.setPreferredSize(new Dimension(200, 304));
        card5.setPreferredSize(new Dimension(200, 304));

        cardPanel.add(card1);
        cardPanel.add(card2);
        cardPanel.add(card3);
        cardPanel.add(card4);
        cardPanel.add(card5);

        panel.add(winningHand, BorderLayout.NORTH);
        panel.add(cardPanel, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }



    public static void main(String[] args) {


        CardFrame fx=new CardFrame();
        if (hand1.RoyalFlush()==true)
        {
            System.out.println("Royal flush");
        }
        else{
            System.out.println("You lost. If you know anyone who has gambling problem, then call 97#########");
        }


    }


}

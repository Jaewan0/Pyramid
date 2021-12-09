import javax.swing.*;
import java.awt.*;

public class PyramidFrame extends JFrame {
    private CardButton[] cardButton = new CardButton[7];
    private DeckButton[] deckButton = new DeckButton[1];
    private ArchiveButton[] archiveButton = new ArchiveButton[1];
    private CardDeck deck = new CardDeck();

    public PyramidFrame() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(8, 1));
        int counter = 1;
        while (counter < 8) {
            JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            for (int j = 0; j < counter; j++) {
                Card c = deck.newCard();
                p1.add(new CardButton(c.getSuit(), this));
                cp.add(p1);
            }
            counter += 1;
        }
        JPanel p2 = new JPanel(new FlowLayout());
        Card c = deck.newCard();
        p2.add(new ArchiveButton("s", this));
        p2.add(new ChangeButton("←", this));
        p2.add(new DeckButton(c.getSuit(), this));
        cp.add(p2);
        setTitle("Pyramid game");
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void change() {
        Card c = deck.newCard();
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new ArchiveButton(c.getSuit(), this));
        p1.add(new ChangeButton("←", this));
        c = deck.newCard();
        p1.add(new DeckButton(c.getSuit(), this));
    }
    public void delete() {

    }

    public static void main(String[] args) {
        new PyramidFrame();
    }
}

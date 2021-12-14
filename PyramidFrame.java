import javax.swing.*;
import java.awt.*;

public class PyramidFrame extends JFrame {
    private DeckButton deckButton;
    private ArchiveButton archiveButton;
    private CardDeck deck = new CardDeck();
    private Container cp;
    private JPanel p2;
    private ImageIcon card_deck;

    public PyramidFrame() {
        cp = getContentPane();
        cp.setLayout(new GridLayout(8, 1));
        int counter = 1;
        while (counter < 8) {
            JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            for (int j = 0; j < counter; j++) {
                Card c = deck.newCard();
                String suit = c.getSuit();
                int rank = c.getRank();
                ImageIcon card = new ImageIcon("./Card_image/" + suit + rank + ".png");
                CardButton cardButton = new CardButton(Integer.toString(rank), this, card);
                cardButton.setBorderPainted(false);
                cardButton.setPreferredSize(new Dimension(67, 98));
                p1.add(cardButton);
                cp.add(p1);
            }
            counter += 1;
        }
        p2 = new JPanel(new FlowLayout());
        Card c = deck.newCard();
        p2.add(archiveButton = new ArchiveButton(this, null));
        p2.add(new ChangeButton("←", this));
        String suit = c.getSuit();
        int rank = c.getRank();
        card_deck = new ImageIcon("./Card_image/" + suit + rank + ".png");
        deckButton = new DeckButton(Integer.toString(rank), this, card_deck);
        deckButton.setBorderPainted(false);
        deckButton.setPreferredSize(new Dimension(70, 98));
        p2.add(deckButton);
        cp.add(p2);
        setTitle("Pyramid game");
        setSize(1920, 1200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void change() {
        archiveButton = new ArchiveButton(this,card_deck);
        Card c = deck.newCard();
        String suit = c.getSuit();
        int rank = c.getRank();
        ImageIcon card = new ImageIcon("./Card_image/" + suit + rank + ".png");
        deckButton = new DeckButton(Integer.toString(rank), this, card);
        p2.add(deckButton);
        p2.add(archiveButton);
        cp.add(p2);
    }


    public static void main(String[] args) {
        new PyramidFrame();
    }
}

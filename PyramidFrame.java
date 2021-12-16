import javax.swing.*;
import java.awt.*;

public class PyramidFrame extends JFrame {
    private DeckButton deckButton;
    private ArchiveButton archiveButton;
    private CardDeck deck = new CardDeck();
    private Container cp;
    private JPanel p2;
    private ImageIcon card_deck;
    private int deck_rank;
    private int first = 0;
    private int second = 0;

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
                cardButton.setPreferredSize(new Dimension(75, 98));
                p1.add(cardButton);
                cp.add(p1);
            }
            counter += 1;
        }
        p2 = new JPanel(new FlowLayout());
        Card c = deck.newCard();
        archiveButton = new ArchiveButton(null,this, null);
        p2.add(new ChangeButton("Change", this));
        p2.add(archiveButton);
        String suit = c.getSuit();
        deck_rank = c.getRank();
        card_deck = new ImageIcon("./Card_image/" + suit + deck_rank + ".png");
        deckButton = new DeckButton(this, card_deck);
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
        p2.remove(archiveButton);
        p2.remove(deckButton);
        p2.add(archiveButton = new ArchiveButton(Integer.toString(deck_rank), this, card_deck));
        archiveButton.setBorderPainted(false);
        archiveButton.setPreferredSize(new Dimension(70, 98));
        Card c = deck.newCard();
        String suit = c.getSuit();
        deck_rank = c.getRank();
        card_deck = new ImageIcon("./Card_image/" + suit + deck_rank + ".png");
        deckButton = new DeckButton(this, card_deck);
        deckButton.setBorderPainted(false);
        deckButton.setPreferredSize(new Dimension(70, 98));
        p2.add(deckButton);
        cp.add(p2);
    }
    public void click_pyramid(int n) {
        first = n;
    }
    public void click_archive(int n) {second = n;}
    public boolean delete() {
        if (first + second == 13) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new PyramidFrame();
    }
}

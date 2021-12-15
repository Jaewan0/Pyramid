import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public DeckButton(String s, PyramidFrame f, ImageIcon i) {
        super(s, i);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Integer.parseInt(getText()) == 13) {
            setVisible(false);
        }
        else if (Integer.parseInt(getText()) != 13) {
            frame.click_deck(Integer.parseInt(getText()));
            if (frame.delete()) {
                setVisible(false);
            }
        }
    }
}

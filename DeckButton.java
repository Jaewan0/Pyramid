import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckButton extends JButton implements ActionListener {
    private PyramidFrame frame;
    private CardButton card;

    public DeckButton(PyramidFrame f, ImageIcon i) {
        super(i);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeckButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public DeckButton(String c, PyramidFrame f) {
        super(c);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

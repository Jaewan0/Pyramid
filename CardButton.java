import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public CardButton(String s,PyramidFrame f, ImageIcon i) {
        super(s, i);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Integer.parseInt(getText()) == 13)
            setVisible(false);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchiveButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public ArchiveButton(String s,PyramidFrame f, ImageIcon i) {
        super(s, i);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.click_deck(Integer.parseInt(getText()));
        if (frame.delete()) {
            setVisible(false);
        }
    }
}
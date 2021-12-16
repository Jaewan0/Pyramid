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
        frame.click_archive(Integer.parseInt(getText()));
        if (Integer.parseInt(getText()) == 13) {
            setVisible(false);
        }
        else {
            frame.click_archive(Integer.parseInt(getText()));
            if (frame.delete()) {
                setVisible(false);
            }
        }
    }
}
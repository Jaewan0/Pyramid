import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchiveButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public ArchiveButton(String c, PyramidFrame f) {
        super(c);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
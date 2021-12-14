import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchiveButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public ArchiveButton(PyramidFrame f, ImageIcon i) {
        super(i);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
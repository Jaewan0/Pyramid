import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeButton extends JButton implements ActionListener {
    private PyramidFrame frame;

    public ChangeButton(String c, PyramidFrame f) {
        super(c);
        frame = f;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.change();
    }
}

import java.awt.*;
import java.awt.event.*;

public class View_1 extends Frame implements ActionListener {
	public View_1() {
        super("ActionListenerTest");
        Button b1 = new Button("BUTTON1");
        b1.addActionListener(this);
        add(b1);
        setSize(200, 100);
        show();
    }
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
 
}
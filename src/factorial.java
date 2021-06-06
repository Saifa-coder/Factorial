
import java.applet.Applet;
import java.awt.TextField;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class factorial extends Applet implements ActionListener {

    TextField t1 = new TextField();
    TextField t2 = new TextField();

    public factorial() {
        Label l1 = new Label("Input number and press enter: ");
        Label l2 = new Label("Factorial: ");
        setLayout(new GridLayout(2, 2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        t1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        Integer num1 = Integer.parseInt(s1);
        long fact = 1;
        if (num1 == 0) {
            t2.setText("" + 0);
        } else {
            for (int i = 1; i <= num1; i++) {
                fact = fact * i;
            }
            t2.setText("" + fact);
        }
    }
}

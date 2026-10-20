import java.awt.*;
import java.awt.event.*;

public class Findmax extends Frame implements ActionListener {
    Frame f1 = new Frame();

    Label l1 = new Label("First number");
    Label l2 = new Label("Second number");
    Label l3 = new Label("Third number");
    Label l4 = new Label("Maximum number");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();

    Button b1 = new Button("Find Max");
    Button b2 = new Button("Clear");
    Button b3 = new Button("Exit");

    Findmax() {

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(l4);
        f1.add(t4);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);

        l1.setBounds(50, 50, 100, 20);
        t1.setBounds(200, 50, 100, 20);
        l2.setBounds(50, 100, 100, 20);
        t2.setBounds(200, 100, 100, 20);
        l3.setBounds(50, 150, 100, 20);
        t3.setBounds(200, 150, 100, 20);
        l4.setBounds(50, 200, 100, 20);
        t4.setBounds(200, 200, 100, 20);
        b1.setBounds(50, 250, 80, 30);
        b2.setBounds(150, 250, 80, 30);
        b3.setBounds(250, 250, 80, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int num3 = Integer.parseInt(t3.getText());

            int max = Math.max(num1, Math.max(num2, num3));
            t4.setText(String.valueOf(max));
        } else if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        } else if (e.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new Findmax();
    }

}
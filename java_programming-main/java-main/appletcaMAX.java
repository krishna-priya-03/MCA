import java.awt.*;
import java.awt.event.*;
 

public class appletcaMAX extends Frame implements ActionListener
{
    Frame f1= new Frame();
    Label l4=new Label("calculator");

    Label l1=new Label("enter first number");
    Label l2=new Label("enter second number");
     Label l3=new Label("enter third number");
    Label l5=new Label("maximu");


    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();


    Button b1=new Button("MAX");
   
    Button b5=new Button("cancel");
    

 appletcaMAX()
 {
    l4.setBounds(150,50,200,20);
    l1.setBounds(50,100,100,20);
    l2.setBounds(50,130,100,20);
    l3.setBounds(50,160,100,20);

    t1.setBounds(200,100,100,20);
    t2.setBounds(200,130,100,20);
    t3.setBounds(200,160,100,20); 
    t4.setBounds(200,190,100,20); 

    b1.setBounds(50,250,50,20);
   
    b5.setBounds(280,250,50,20);
     

    f1.add(l4);
    f1.add(l1);
    f1.add(l2);
    f1.add(l3);
    f1.add(l5);
    f1.add(t1);
    f1.add(t2);
    f1.add(t3);

    f1.add(b1);

    f1.add(b5);

    b1.addActionListener(this);
  
    b5.addActionListener(this);

    f1.setLayout(null);
    f1.setVisible(true);
    f1.setSize(500,500);
    b1.setBackground(Color.magenta);

    b5.setBackground(Color.ORANGE);
    f1.setBackground(Color.lightGray);
 }  
 public void actionPerformed(ActionEvent e)
 {
     try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());

            int max = a;

            if (b > max)
                max = b;
            if (c > max)
                max = c;

            result.setText(String.valueOf(max));

        } 
        catch (Exception ex) 
        {
            result.setText("Invalid Input");
        }
    }
 public static void main(String args[])
    {
        new appletcaMAX();

    }
}

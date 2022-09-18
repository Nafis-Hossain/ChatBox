package Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBox {
    public static void main(String[]args) {

        int i=0;
        String[] text = new String[7];

        JFrame Frame1= new JFrame("Privet Messenger");


        //
        JLabel l1 = new JLabel("Your text here");
        Frame1.add(l1);
        l1.setBounds(20,350,330,40);


        //

        JTextField t1 = new JTextField(20);
        t1.setBounds(20,400,330,40);
        Frame1.add(t1);

        JButton a = new JButton("send");
        Frame1.add(a);
        a.setBounds(370,400,90,40);
        a.setBackground(Color.LIGHT_GRAY);

         a.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {

             }
         });

        JPanel panel1 = new JPanel();
        Frame1.add(panel1);
        panel1.setBounds(0, 0, 500, 500);
        panel1.setBackground(Color.BLACK);


        Frame1.setSize(500,500);
        Frame1.setLayout(null);
        Frame1.setVisible(true);


    }
}



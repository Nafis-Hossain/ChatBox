import javax.swing.*;
import java.awt.*;


public class LogIn {
    public static void main(String[] args) {

        //Frame 01
        JFrame inFrame = new JFrame("OOP LAB");
        inFrame.setBounds(0, 0,700,700);


        //label 01 Sign up
        JLabel facebook = new JLabel("Facebook");
        facebook.setBounds(230,30,400,100);
        facebook.setForeground(Color.BLUE);
        facebook.setFont(new Font("Arial", Font.BOLD, 45));
        inFrame.add(facebook);

        //label 02 Its free
        JLabel text1 = new JLabel("Facebook helps you connect and ");
        text1.setBounds(220,80,400,100);
        text1.setForeground(Color.black);
        text1.setFont(new Font("Arial", Font.BOLD, 15));
        inFrame.add(text1);

        //label 02 Its free
        JLabel text2 = new JLabel("share with the people in your life.");
        text2.setBounds(220,100,400,100);
        text2.setForeground(Color.black);
        text2.setFont(new Font("Arial", Font.BOLD, 15));
        inFrame.add(text2);


        //label 04 Why do i need to provide this?
        JLabel text3 = new JLabel("Forgotten Password?");
        text3.setBounds(270,400,300,50);
        text3.setForeground(Color.BLUE);
        text3.setFont(new Font("Arial", Font.BOLD, 15));
        inFrame.add(text3);

        ///////

        //Text feild 01
        JTextField t4 = new JTextField();
        t4.setBounds(195,230,300,40);
        inFrame.add(t4);


        //password feild 01
        JPasswordField pass1 = new JPasswordField();
        pass1.setBounds(195,290,300,40);
        inFrame.add(pass1);

        //

        JButton LoginButton = new JButton("Log In");
        LoginButton.setBounds(195,360,300,40);
        LoginButton.setForeground(Color.white);
        LoginButton.setBackground(Color.blue);
        LoginButton.setFont(new Font("Arial", Font.BOLD, 20));
        inFrame.add(LoginButton);

        JLabel bar = new JLabel("--------------------------------------------------------------------");
        bar.setBounds(170,430,380,50);
        bar.setForeground(Color.black);
        bar.setFont(new Font("Arial", Font.BOLD, 15));
        inFrame.add(bar);

        JButton CreateButton = new JButton("Create New Account");
        CreateButton.setBounds(235,490,200,40);
        CreateButton.setForeground(Color.white);
        CreateButton.setBackground(Color.GREEN);
        CreateButton.setFont(new Font("Arial", Font.BOLD, 15));
        inFrame.add(CreateButton);


        //panel 01
        JPanel inpanel = new JPanel();
        inpanel.setBounds(140,205,400,350);
        inpanel.setBackground(Color.lightGray);
        inFrame.add(inpanel);
        inpanel.setVisible(true);


        inFrame.setLayout(null);
        inFrame.setVisible(true);
        inFrame.setLocationRelativeTo(null);

    }
}


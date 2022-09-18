package Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;


public class SignUp {
    public static void main(String[] args) {

        //Frame 01
        JFrame Frame1 = new JFrame("OOP LAB");
        Frame1.setBounds(0, 0,700,700);


        //Button sign up
        JButton SignUpButton = new JButton("Sign Up");
        SignUpButton.setBounds(200,500,100,40);
        SignUpButton.setBackground(Color.GREEN);
        SignUpButton.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(SignUpButton);

        //label 01 Sign up
        JLabel L1 = new JLabel("Sign up");
        L1.setBounds(20,10,200,40);
        L1.setForeground(Color.BLUE);
        L1.setFont(new Font("Arial", Font.BOLD, 35));
        Frame1.add(L1);

        //label 02 Its free
        JLabel L2 = new JLabel("Its free and always will be.");
        L2.setBounds(20,40,400,50);
        L2.setForeground(Color.BLUE);
        L2.setFont(new Font("Arial", Font.ITALIC, 25));
        Frame1.add(L2);

        //label 04 First Name
        JLabel L3 = new JLabel("First Name:");
        L3.setBounds(100,100,100,50);
        L3.setForeground(Color.BLACK);
        L3.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L3);

        //label 04 Last Name
        JLabel L4 = new JLabel("Last Name:");
        L4.setBounds(100,150,100,50);
        L4.setForeground(Color.BLACK);
        L4.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L4);

        //label 04 Your Email
        JLabel L5 = new JLabel("Your Email:");
        L5.setBounds(100,200,100,50);
        L5.setForeground(Color.BLACK);
        L5.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L5);

        //label 04 Re-enter Email
        JLabel L6 = new JLabel("Re-enter Email:");
        L6.setBounds(70,250,120,50);
        L6.setForeground(Color.BLACK);
        L6.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L6);

        //label 04 New Password
        JLabel L7 = new JLabel("New Password:");
        L7.setBounds(70,300,120,50);
        L7.setForeground(Color.BLACK);
        L7.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L7);

        //label 04 Last Name
        JLabel L8 = new JLabel("I am:");
        L8.setBounds(145,350,100,50);
        L8.setForeground(Color.BLACK);
        L8.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L8);

        //label 04 Birthday:
        JLabel L9 = new JLabel("Birthday:");
        L9.setBounds(110,400,100,50);
        L9.setForeground(Color.BLACK);
        L9.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L9);

        //label 04 Why do i need to provide this?
        JLabel L10 = new JLabel("Why do i need to provide this?");
        L10.setBounds(200,450,300,50);
        L10.setForeground(Color.BLUE);
        L10.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L10);


        ///////
        //Text feild 01
        JTextField t2 = new JTextField();
        t2.setBounds(200,105,400,40);
        Frame1.add(t2);

        //Text feild 01
        JTextField t3 = new JTextField();
        t3.setBounds(200,155,400,40);
        Frame1.add(t3);

        //Text feild 01
        JTextField t4 = new JTextField();
        t4.setBounds(200,205,400,40);
        Frame1.add(t4);

        //Text feild 01
        JTextField t5 = new JTextField();
        t5.setBounds(200,255,400,40);
        Frame1.add(t5);

        //Text feild 01
        JPasswordField p1 = new JPasswordField();
        //JTextField t6 = new JTextField();
        p1.setBounds(200,305,400,40);
        Frame1.add(p1);


        //label 04 Last Name
        JLabel L11 = new JLabel("Select Sex:");
        L11.setBounds(200,350,100,50);
        L11.setForeground(Color.BLACK);
        L11.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L11);

        //label 04 Last Name
        JLabel L15 = new JLabel("DEVELOPED BY NAFIS");
        L15.setBounds(550,625,200,30);
        L15.setForeground(Color.BLACK);
        L15.setFont(new Font("Arial", Font.ITALIC, 10));
        Frame1.add(L15);


        String[] gender = {"⚥","Male", "Female"};
        JComboBox cm1 = new JComboBox(gender);
        cm1.setBounds(290,355,70,40);
        Frame1.add(cm1);


        //label 04 Last Name
        JLabel L12 = new JLabel("Month:");
        L12.setBounds(200,400,100,50);
        L12.setForeground(Color.BLACK);
        L12.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L12);

        String[] month = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October","November", "December"};
        JComboBox cm2 = new JComboBox(month);
        cm2.setBounds(260,405,90,40);
        Frame1.add(cm2);


        //label 04 Last Name
        JLabel L13 = new JLabel("Day:");
        L13.setBounds(360,400,30,50);
        L13.setForeground(Color.BLACK);
        L13.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L13);

        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
                "23", "24", "25","26", "27", "28", "29", "30", "31"};
        JComboBox cm3 = new JComboBox(day);
        cm3.setBounds(400,405,40,40);
        Frame1.add(cm3);


        //label 04 Last Name
        JLabel L14 = new JLabel("Year:");
        L14.setBounds(450,400,40,50);
        L14.setForeground(Color.BLACK);
        L14.setFont(new Font("Arial", Font.BOLD, 15));
        Frame1.add(L14);

        String[] year = {"1990", "1991", "1992", "1993", "1994", "1995", "1996",
                "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                "2015","2016","2017","2018","2019","2020","2021","2022" };
        JComboBox cm4 = new JComboBox(year);
        cm4.setBounds(500,405,70,40);
        Frame1.add(cm4);


        /////
        SignUpButton.addActionListener(new ActionListener() {
        public void actionPerformed (java.awt.event.ActionEvent ae) {


            String FirstName = t2.getText();
            String LastName = t3.getText();
            String Email = t4.getText();
            String ReEmail = t5.getText();
            String Password = String.valueOf(p1.getPassword());

            String selectedsex = cm1.getSelectedItem().toString();
            String selectedMonth = cm2.getSelectedItem().toString();
            String selectedDay = cm3.getSelectedItem().toString();
            String selectedYear = cm4.getSelectedItem().toString();
            Frame1.dispose();




                File myFile = new File("SignUpData.txt");
                try {
                    FileWriter fw = new FileWriter("SignUpData.txt", true);
                    //fw.write("User Number :" +i);
                    fw.write("\nEmail :" + Email);
                    fw.write("\nPassword :" + Password);
                    fw.write("\nFull Name :" + FirstName + LastName);
                    fw.write("\nGender :" + selectedsex);
                    fw.write("\nDate of Birth :" + selectedMonth +" " +selectedDay +""+ selectedYear);
                    fw.write("\n\n");

                    fw.close();



                } catch (Exception e) {
                    e.printStackTrace();
                }


            if(FirstName.equals("") || LastName.equals("") || Email.equals("") || ReEmail.equals("") || Password.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter all the informations ");
            }

            else {
                JOptionPane.showMessageDialog(null, "You have signed up successfully ");


                //Frame 01
                JFrame inFrame = new JFrame("OOP LAB");
                inFrame.setBounds(0, 0, 700, 700);


                //label 01 Sign up
                JLabel facebook = new JLabel("Facebook");
                facebook.setBounds(240, 30, 400, 100);
                facebook.setForeground(Color.BLUE);
                facebook.setFont(new Font("Arial", Font.BOLD, 45));
                inFrame.add(facebook);

                //label 02 Its free
                JLabel text1 = new JLabel("Facebook helps you connect and ");
                text1.setBounds(230, 80, 400, 100);
                text1.setForeground(Color.black);
                text1.setFont(new Font("Arial", Font.BOLD, 15));
                inFrame.add(text1);

                //label 02 Its free
                JLabel text2 = new JLabel("share with the people in your life.");
                text2.setBounds(230, 100, 400, 100);
                text2.setForeground(Color.black);
                text2.setFont(new Font("Arial", Font.BOLD, 15));
                inFrame.add(text2);


                //label 04 Why do i need to provide this?
                JLabel text3 = new JLabel("Forgotten Password?");
                text3.setBounds(270, 400, 300, 50);
                text3.setForeground(Color.BLUE);
                text3.setFont(new Font("Arial", Font.BOLD, 15));
                inFrame.add(text3);


                //Text feild 01
                JTextField logField = new JTextField();
                logField.setBounds(195, 230, 300, 40);
                inFrame.add(logField);


                //password feild 01
                JPasswordField pass1 = new JPasswordField();
                pass1.setBounds(195, 290, 300, 40);
                inFrame.add(pass1);

                //

                JButton LoginButton = new JButton("Log In");
                LoginButton.setBounds(195, 360, 300, 40);
                LoginButton.setForeground(Color.white);
                LoginButton.setBackground(Color.blue);
                LoginButton.setFont(new Font("Arial", Font.BOLD, 20));
                inFrame.add(LoginButton);

                JLabel bar = new JLabel("--------------------------------------------------------------------");
                bar.setBounds(170, 430, 380, 50);
                bar.setForeground(Color.black);
                bar.setFont(new Font("Arial", Font.BOLD, 15));
                inFrame.add(bar);

                JButton CreateButton = new JButton("Create New Account");
                CreateButton.setBounds(235, 490, 200, 40);
                CreateButton.setForeground(Color.white);
                CreateButton.setBackground(Color.GREEN);
                CreateButton.setFont(new Font("Arial", Font.BOLD, 15));



                inFrame.add(CreateButton);
                inFrame.setLayout(null);
                inFrame.setVisible(true);
                inFrame.setLocationRelativeTo(null);

                LoginButton.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent aee) {



                        JOptionPane.showMessageDialog(null, "Welcome to Facebook! ");



                    }
                }

                );
            }
        }
        });


        Frame1.setLayout(null);
        Frame1.setVisible(true);
        Frame1.setLocationRelativeTo(null);

    }
}


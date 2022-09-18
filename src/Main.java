import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(480, 650);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        JLabel signupLabel = new JLabel("Sign Up!");
        signupLabel.setBounds(20, 5, 250, 30);
        signupLabel.setFont(new Font(Font.SANS_SERIF, 800, 20));
        frame.add(signupLabel);
//        signupLabel.setOpaque(true);
//        signupLabel.setBackground(Color.BLUE);
//        signupText.setSize(100,20);

        JLabel freeLabel = new JLabel("It's free, and always will be.");
        freeLabel.setBounds(20, 40 , 350, 30);
        freeLabel.setFont(new Font(Font.SANS_SERIF, 800, 20));
        frame.add(freeLabel);
//        freeLabel.setOpaque(true);
//        freeLabel.setBackground(Color.green);


        JLabel firstNameLabel = new JLabel("First Name: ");
        frame.add(firstNameLabel);
        firstNameLabel.setBounds(50, 120, 100, 50);

        JTextField firstNameTextF = new JTextField();
        frame.add(firstNameTextF);
        firstNameTextF.setBounds(130, 120, 300, 50);

        JLabel lastNameLabel = new JLabel("Last Name: ");
        frame.add(lastNameLabel);
        lastNameLabel.setBounds(50, 170, 100, 50);

        JTextField lastNameTextF = new JTextField();
        frame.add(lastNameTextF);
        lastNameTextF.setBounds(130, 170, 300, 50);

        JLabel yourEmailLabel = new JLabel("Your Email: ");
        frame.add(yourEmailLabel);
        yourEmailLabel.setBounds(50, 220, 100, 50);

        JTextField yourEmailTextF = new JTextField();
        frame.add(yourEmailTextF);
        yourEmailTextF.setBounds(130, 220, 300, 50);

        JLabel reEmailLabel = new JLabel("re-enter Email: ");
        frame.add(reEmailLabel);
        reEmailLabel.setBounds(30, 270, 100, 50);

        JTextField reEmailTextF = new JTextField();
        frame.add(reEmailTextF);
        reEmailTextF.setBounds(130, 270, 300, 50);

        JLabel newPassLabel = new JLabel("New Password: ");
        frame.add(newPassLabel);
        newPassLabel.setBounds(30, 320, 100, 50);

        JPasswordField newPassTextF = new JPasswordField();
        frame.add(newPassTextF);
        newPassTextF.setBounds(130, 320, 300, 50);




        JLabel iAmLabel = new JLabel("I am: ");
        frame.add(iAmLabel);
        iAmLabel.setBounds(90, 370, 150, 50);

        String[] genders = {"Male", "Female"};
        JComboBox genderBox = new JComboBox(genders);
        frame.add(genderBox);
        genderBox.setBounds(130, 370, 120, 50);

        JTextField iAmTextF = new JTextField(" select sex");
        frame.add(iAmTextF);
        iAmTextF.setBounds(130, 370, 120, 50);
        iAmTextF.setEnabled(false);



        JLabel BDLabel = new JLabel("Birthday: ");
        frame.add(BDLabel);
        BDLabel.setBounds(65, 420, 100, 50);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        JComboBox monthBox = new JComboBox(months);
        frame.add(monthBox);
        monthBox.setBounds(130, 420, 90, 50);

        JTextField monthTextF = new JTextField(" month:");
        frame.add(monthTextF);
        monthTextF.setBounds(130, 420, 90, 50);
        monthTextF.setEnabled(false);


        String[] days = {"01", "02", "03","04", "05", "06", "07", "08", "09", "10", "11",
                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
                "24", "25","26", "27", "28", "29", "30", "31"};
        JComboBox dayBox = new JComboBox(days);
        frame.add(dayBox);
        dayBox.setBounds(225, 420, 75, 50);

        JTextField dayTextF = new JTextField(" day:");
        frame.add(dayTextF);
        dayTextF.setBounds(225, 420, 75, 50);
        dayTextF.setEnabled(false);


        String[] years = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997",
                "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                "2016","2017","2018","2019","2020","2021","2022" };
        JComboBox yearBox = new JComboBox(years);
        frame.add(yearBox);
        yearBox.setBounds(305, 420, 85, 50);

        JTextField yearTextF = new JTextField(" year:");
        frame.add(yearTextF);
        yearTextF.setBounds(305, 420, 85, 50);
        yearTextF.setEnabled(false);

        JLabel whyLabel = new JLabel("why do I need to provide this?");
        frame.add(whyLabel);
        whyLabel.setBounds(135, 470, 350,20);

        JButton signUpBtn = new JButton("Sign up");
        frame.add(signUpBtn);
        signUpBtn.setBounds(130,500,140, 40);



        // METHODS
        genderBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String gender = genderBox.getSelectedItem().toString();
                iAmTextF.setText(gender);
            }
        });

        dayBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String day = dayBox.getSelectedItem().toString();
                dayTextF.setText(day);
            }
        });

        monthBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String month = monthBox.getSelectedItem().toString();
                monthTextF.setText(month);
            }
        });

        yearBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String year = yearBox.getSelectedItem().toString();
                yearTextF.setText(year);
            }
        });
        signUpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameTextF.getText();
                String lastName = lastNameTextF.getText();
                String email = yourEmailTextF.getText();
                String reEmail = reEmailTextF.getText();
                String password = String.valueOf(newPassTextF.getPassword());
                String gender = genderBox.getSelectedItem().toString();
                String day = dayBox.getSelectedItem().toString();
                String month = monthBox.getSelectedItem().toString();
                String year = yearBox.getSelectedItem().toString();

                if(!firstName.equals("")
                        && !gender.equals("")
                        && !email.equals("") && !reEmail.equals("")
                        && !password.equals("") && !day.equals("")
                        && !month.equals("") && !year.equals("")){
                    if(email.equals(reEmail)){
                        // Start working with file.
                        try{
                            FileWriter signupInfo = new FileWriter("newUserInfo.txt", true);
                            signupInfo.write("user Name: "+ firstName+" " + lastName+"\n");
                            signupInfo.write("user Gender: "+ gender +"\n");
                            signupInfo.write("user DOB: "+ month+" "+day+", "+year +"\n");
                            signupInfo.write("user Email: "+ email +"\n");
                            signupInfo.write("user Password: " + password+"\n\n\n");
                            signupInfo.close();


                            JPanel completeSignup = new JPanel();
                            frame.add(completeSignup);
                            completeSignup.setBounds(0,0,480, 650);
                            completeSignup.setBackground(Color.BLUE);


                        }catch (Exception err){
                            JOptionPane.showMessageDialog(null, "File not found!");
                        }
                        JOptionPane.showMessageDialog(null, "Information saved to file!");
                    }else{
                        JOptionPane.showMessageDialog(null, "your email is not matched!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please, fill all the field!");
                }
            }
        });








    }
}
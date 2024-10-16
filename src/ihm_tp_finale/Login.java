package ihm_tp_finale;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Login {
	
	String username;
    String password;	 

   public Login(String username, String password) {
       this.username = username;
       this.password = password;

       JFrame frame = new JFrame();

       frame.setTitle("Admin Login Page | by -chaker necibi-");
       frame.setSize(542, 436);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);

       
       JLayeredPane layeredPane = new JLayeredPane();
       layeredPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "-- Welcome TO CH-POS --", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Tahoma", Font.BOLD, 18), new Color(146, 146, 146)));
       layeredPane.setBounds(10, 20, 510, 373);
       frame.add(layeredPane);
       
       JLabel login_label = new JLabel("Login/Sign Up");
       login_label.setFont(new Font("Tahoma", Font.BOLD, 20));
       login_label.setBounds(200, 23, 200, 30);
       layeredPane.add(login_label);
       
       JLabel username_label = new JLabel("Username :");
       username_label.setFont(new Font("Tahoma", Font.BOLD, 13));
       username_label.setBounds(40, 50, 94, 26);
       layeredPane.add(username_label);
       
       JTextField user_txtfield = new JTextField();
       user_txtfield.setColumns(30);
       user_txtfield.setBounds(110, 90, 314, 30);
       layeredPane.add(user_txtfield);
       
       JLabel password_label = new JLabel("Password :");
       password_label.setFont(new Font("Tahoma", Font.BOLD, 13));
       password_label.setBounds(40, 140, 94, 26);
       layeredPane.add(password_label);
       
       JPasswordField pass_txtfield = new JPasswordField();
       pass_txtfield.setColumns(30);
       pass_txtfield.setBounds(110, 170, 314, 30);
       layeredPane.add(pass_txtfield);
       
       JButton login_btn = new JButton("Login");
       login_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
       login_btn.setBackground(new Color(140, 232, 142));
       login_btn.setBounds(110, 230, 314, 30);
       frame.getRootPane().setDefaultButton(login_btn);
       layeredPane.add(login_btn);
       
       login_btn.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String inputUsername = user_txtfield.getText();
               String inputPassword = new String(pass_txtfield.getPassword());

               if (inputUsername.equals(username) && inputPassword.equals(password)) {
                   JOptionPane.showMessageDialog(frame, "Login Successful" , "LOGIN SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                   frame.setVisible(false);
                   new UserUI();
                   
               } else {
                   JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "LOGIN FAILED", JOptionPane.ERROR_MESSAGE);
               }
           }
       });
       
       
       JLabel signup_label = new JLabel("Or Sign Up Here :");
       signup_label.setFont(new Font("Tahoma", Font.BOLD, 13));
       signup_label.setBounds(56, 290, 200, 30);
       layeredPane.add(signup_label);
       
       JButton signup_btn = new JButton("Sign Up");
       signup_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
       signup_btn.setBackground(new Color(255, 255, 0));
       signup_btn.setBounds(110, 330, 314, 30);
       layeredPane.add(signup_btn);
       
       
       
       
       
       frame.setVisible(true);
   }}



/*
 * Albana Beqo
 * Ryan Urbanski
 * IST 311
 * TabOut Application
 * November 3, 2019
 * 
 * HONOR PLEDGE: On my honor as a student of Penn State University,
 * I have neither given nor received unauthorized help on this homework assignment.
 * NAME: Ryan Urbanski, Albana Beqo
 * EMAIL: ryanurbanski9@gmail.com | rlu106@psu.edu
 *        apb5728@psu.edu
 * 
 * DESCRIPTION: TabOut is an application written to simulate a mobile dining
 * application for users to pay and split their restaurant tabs from their phone.
 */

package View;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * This displays the text entry boxes to verify user information
 * @author ryan
 */
public class LoginUI extends JPanel {
    
//    public JButton userName;          // These were throwing us off
//    public JButton password;
    public JButton login;
    public JButton cancel;
    public JButton text;
    
    public JTextField t1;               // Used for userName textField
    public JTextField t2;               // Used for Password textField
    public JTextField t3;               // Not used
    
    
    public LoginUI () {
        
        super();
        setBackground(Color.darkGray);
        GridLayout g = new GridLayout(5,1);
        setLayout(g);
        

        t1 = new JTextField("User Name");
        add(t1);
        
        t2 = new JTextField("Password");
        add(t2);
        
        login = new JButton("Login");
        add(login);
//        addActionListener(this);
        
        cancel = new JButton("Cancel");
        add(cancel);

        text = new JButton(" Enter Username and Password then Press Log In");
        add(text);
        
    }

}

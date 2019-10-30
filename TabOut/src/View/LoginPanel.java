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
public class LoginPanel extends JPanel 
       {
    
    private JButton userName;
    private JButton password;
    private JButton login;
    private JButton cancel;
    private JButton text;
    
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    
    
    public LoginPanel () {
        
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

        t3 = new JTextField(" ");
        add(t3);
        
    }

    /**
     * @return the userName
     */
    public JButton getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(JButton userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public JButton getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(JButton password) {
        this.password = password;
    }

    /**
     * @return the login
     */
    public JButton getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(JButton login) {
        this.login = login;
    }

    /**
     * @return the cancel
     */
    public JButton getCancel() {
        return cancel;
    }

    /**
     * @param cancel the cancel to set
     */
    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    /**
     * @return the text
     */
    public JButton getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(JButton text) {
        this.text = text;
    }

    /**
     * @return the t1
     */
    public JTextField getT1() {
        return t1;
    }

    /**
     * @param t1 the t1 to set
     */
    public void setT1(JTextField t1) {
        this.t1 = t1;
    }

    /**
     * @return the t2
     */
    public JTextField getT2() {
        return t2;
    }

    /**
     * @param t2 the t2 to set
     */
    public void setT2(JTextField t2) {
        this.t2 = t2;
    }

    /**
     * @return the t3
     */
    public JTextField getT3() {
        return t3;
    }

    /**
     * @param t3 the t3 to set
     */
    public void setT3(JTextField t3) {
        this.t3 = t3;
    }

     

   

  
    
}

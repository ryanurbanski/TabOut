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

package Controller;

import Model.UserList;
import View.LoginPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Controls the login interface
 * @author ryan
 */
public class LoginCtrl extends JFrame implements ActionListener {
    
    LoginPanel theLoginPanel;
    UserList theUserList;
    NavCtrl theNavigation;
    
    public LoginCtrl() {
        
        theNavigation = new NavCtrl();
        theUserList = new UserList();
        theLoginPanel = new LoginPanel();
        add (theLoginPanel);
        
        this.theLoginPanel.getLogin().addActionListener(this);            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(1200, 800);
            setVisible(true);
            
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object obj = ae.getSource();
        
        if(obj == theLoginPanel.getLogin())
        {
            if(theUserList.authenticate(theLoginPanel.getUserName().getText(),
                    theLoginPanel.getPassword().getText()))
                     
            { 
                System.out.println("authenticated");
                
                // Print feedback to the bottom button or textfield in LoginUI
                theLoginPanel.getT3().setText("User authenticated.  Opening Main Navigation Panel...");
                
                // Launch navigation UI
                theNavigation = new NavCtrl();
            }
            else   
                System.out.println("Invalid login");
           
        }
    }
    
}

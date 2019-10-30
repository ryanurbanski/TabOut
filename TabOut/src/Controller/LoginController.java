/*
 * Albana Beqo
 * Ryan Urbanski
 * IST 311
 * TabOut Application
 * Ocotber 20, 2019
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
public class LoginController extends JFrame implements ActionListener{
    
    LoginPanel theLoginPanel;
    UserList theUserList;
    NavigationCtrl theNavigation;
    
    public LoginController() {
    theNavigation=new NavigationCtrl();
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
            theNavigation = new NavigationCtrl();
            }
            else   
                System.out.println("Invalid login");
           
        }
    }
}

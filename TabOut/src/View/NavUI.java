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

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the JFrme that comes up when a user logs in successfully
 * @author ryan
 */
public class NavUI extends JFrame {
    
    JButton startTabButton;
    JButton payTabButton;
    JButton exitButton;
    JButton messageButton;
    
    JPanel mainPanel;
    
    public NavUI() {
        
        // Creates and Formats the JFrame for the Main Menu
        super();
        setSize(800,800);
        setLocationRelativeTo(null);
        setTitle("Main Menu");
        setResizable(false);
        setLayout(null);
        
        // Creates a Navigation Pane from JPanel
        mainPanel = new JPanel();
        mainPanel.setSize(800, 800);
        GridLayout g = new GridLayout(4,1);
        mainPanel.setLayout(g);
        setBackground(Color.darkGray);
        add(mainPanel);
        
        // Add buttons to JPanel
        startTabButton = new JButton("Start Tab");
        mainPanel.add(startTabButton);
        payTabButton = new JButton("Pay Tab");
        mainPanel.add(payTabButton);
        exitButton = new JButton("Exit");
        mainPanel.add(exitButton);
        messageButton = new JButton(" ");              // Will be used to display messages
        mainPanel.add(messageButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}



        // Original Formatting from Sprint One
//        super();
//        setBackground(Color.darkGray);
//        GridLayout g = new GridLayout(3,1);
//        setLayout(g);
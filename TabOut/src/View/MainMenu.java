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
import javax.swing.JPanel;

/**
 * This is the panel that comes up when a user logs in successfully
 * @author ryan
 */
public class MainMenu extends JPanel {
    
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    
    public MainMenu(){
        super();
        setBackground(Color.darkGray);
        GridLayout g = new GridLayout(3,1);
//        BorderLayout b = new BorderLayout();
        setLayout(g);
        
        b1 = new JButton("Start Tab");
        add(b1);
        b2 = new JButton("Pay Tab");
        add(b2);
        b3 = new JButton("Exit");
        add(b3);
        b4 = new JButton(" ");              // Will be used to display messages
        add(b4);
        
    }
    
}

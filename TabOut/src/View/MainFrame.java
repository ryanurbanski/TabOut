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

package View;

import java.awt.*;
import javax.swing.*;

/**
 * Outside frame container class
 * @author ryan
 */
class MainFrame extends JFrame{
    
    LoginPanel lp;
//    MainMenu mnp;
    
    public MainFrame() {
        super("TabOut");
        setupLayoutForMacs();
        BorderLayout b = new BorderLayout();
        setLayout(b);
        
        // Create panel
        lp = new LoginPanel();
        add(lp, "Center");

        // To test the main menu view
//        mnp = new MainMenu();
//        add(mnp,"Center");
        
        // Frame formatting 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 600);
        setVisible(true);
    }
    
    /**
     * Some MAC's need this method for the background color
     * of the button to appear
     */
    private void setupLayoutForMacs() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

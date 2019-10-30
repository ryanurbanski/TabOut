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
import View.MainMenu;
import View.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 

/**
 * This is the main navigation controller 
 * @author alban
 */
public class NavCtrl   {

    UserList list;
    MainMenu mainPanel;
     
    int currentIndex;

    public NavCtrl() {
      //  animalListUI = new AnimalListUI();
//        list = new UserList();
      //  populateList();
        mainPanel = new MainMenu();
//        currentIndex = 0;
//        populateUser();
////        MainMenu. .addActionListener(this);
//    }

//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        Object obj = ae.getSource();
//        if (obj == animalUI.forward) {
//            currentIndex++;
//            populateUser();
//        }
//    }
//
//    public void populateUser() {
//
//        animalUI.nameBox.setText(list.getAnimalList().get(currentIndex).getName());
//        animalUI.typeBox.setText(list.getAnimalList().get(currentIndex).getType());
//
//    }
//}
    }
}
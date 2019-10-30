/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserList;
import View.MainMenu;
import View.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 

/**
 *
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
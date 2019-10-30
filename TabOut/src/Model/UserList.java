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

package Model;

import java.util.ArrayList;

public class UserList {
    ArrayList<User> listOfUsers = new ArrayList<>();
    public UserList(){
        listOfUsers.add(new User("first", "test1"));
        listOfUsers.add(new User("second", "test"));
        
    }
    public boolean authenticate(String username, String password){
        
        for (User user : listOfUsers) {
            if(user.getUsername().equalsIgnoreCase(username) && 
                    user.getPassword().equalsIgnoreCase(password))
                return true;         
        }
        return false;
    }
    
}
 
    

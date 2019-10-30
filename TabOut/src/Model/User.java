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

package Model;

/**
 * Class with user information
 * @author ryan
 */
    
  public class User {
    String username, password;
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username; 
    }
    public String getPassword(){
        return password;
    }
    public String toString(){
        return username + password;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10;

/**
 *
 * @author flashomer
 */
public class Customer {
    private String username;
    private String password;
    private Basket myBasket;
    
    public Customer(String username_, String password_){
        this.username = username_;
        this.password = password_;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
      
    
    
    
}

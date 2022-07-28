/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s9;

/**
 *
 * @author flashomer
 */
public class NewClass {
    private double balance = 0;
    private String owner;
    
    public NewClass (double balance, String owner){
        this.balance = balance;
        this.owner = owner;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void setBalance(double a){
       this.balance = a;
    }
    
    public void setOwner(String b){
       this.owner = b;
    }
    

    public String toString(){
        return (this.owner+"'s account has a balance of "+this.balance+" TL");
    }
    
    public double withdraw(double money){
     if(money < this.balance) {
         balance = balance - money;
         return balance;
     }   else {
         System.out.println("There is no enough money of "+this.owner);
         return 0;
     }
    } 
    
    public double Deposit(double money){
        this.balance += money;
        return balance;
    }
    
}

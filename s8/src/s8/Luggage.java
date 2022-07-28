/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s8;

/**
 *
 * @author flashomer
 */
public class Luggage {
    
    private int laggage_ID;
    private int weight_kilo;
    private String belongsTo;
    private double capacity_lt;
    private static int lastUsedId = 500;
    
    
    public Luggage(String belongsTo,int weight_kilo, double capacity_lt){
        
       this.belongsTo = belongsTo;
       this.weight_kilo = weight_kilo;
       this.capacity_lt = capacity_lt;
       laggage_ID = lastUsedId++;
       
       
    }
    
    public int getLuggage_Id(){
        return laggage_ID;
    }
    public int getWeight(){
        return weight_kilo;
    }
    public double getCapacity_lt(){
        return capacity_lt;
    }
    public String getBelongsTo(){
        return belongsTo;
    }
    
    public String toString(){
        return ("ID: "+laggage_ID+"\nBelongs to: "+belongsTo+"\nWeight of the luggage: "+weight_kilo+"\nCapacity of the luggage: "+capacity_lt+"Liters. \n\n");
    }
    

    
    
}

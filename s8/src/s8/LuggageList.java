/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s8;
import s8.Luggage;

/**
 *
 * @author flashomer
 */
public class LuggageList {
  
    public static final int MAX_COUNT = 5;
    public static final int MAX_KILOS = 50;
    private static Luggage myLuggages[] =  new Luggage[MAX_COUNT];
    private static int total_Kilo = 0;
    private static int total_LuggageCount = 0;
    
    public static boolean addLuggage(Luggage a){
        if(total_LuggageCount < MAX_COUNT && (a.getWeight()+total_Kilo < MAX_KILOS )){
            myLuggages[total_LuggageCount++] = a;
            total_Kilo += a.getWeight();
            return true;
        } else {
            return false; 
        }
        
    }
    
    public static boolean removeLuggage(String a){
        int id = Integer.parseInt(a);
        
        for(int i = 0; i<total_LuggageCount; i++){
            if(id == myLuggages[i].getLuggage_Id()) {
                System.out.println("The luggage belonging to"+myLuggages[i].getBelongsTo()+"is removed.");
                
                myLuggages[i] = myLuggages[--total_LuggageCount];
                
                return true;                        
            }
            
        }
        return false;
       
    }
    
    public static Luggage getLuggage(String belongsTo){
        
        for(int i=0; i<=total_LuggageCount; i++){
            if(belongsTo.equalsIgnoreCase(myLuggages[i].getBelongsTo())){
                return myLuggages[i];
            }
        }
                
         return null;
     } 
     
    public static Luggage[] getAll(){    
         return myLuggages;
    }
    
    public static Luggage getHighestCapacityLuggage(String a){
        int indexOfhigest = 0;
        for(int i=0; i<total_LuggageCount; i++){
            if(myLuggages[i].getCapacity_lt()>myLuggages[indexOfhigest].getCapacity_lt()){
                indexOfhigest = i;
            }
        }
        return myLuggages[indexOfhigest];
     }
    
    public static void display(){
        String output = "";
        for(int i=0; i<total_LuggageCount; i++){
           output += myLuggages[i].toString();
        }
        
      System.out.println(output);
      
        
    }
    
      
}

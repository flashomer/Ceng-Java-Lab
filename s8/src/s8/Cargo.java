/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s8;

import java.util.Scanner;
import s8.*;

/**
 *
 * @author flashomer
 */
public class Cargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] WHL = new String[3];
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Luggage L;
    

    
    for(int i= 0; i<LuggageList.MAX_COUNT; i++){
        
      System.out.println("\nLuggage no. "+(i+1)+":");
      System.out.println("\nBelongs to: ");
      String belongsTo = input1.nextLine();
      System.out.println("\nEnter weight in kilos: ");
      int weightKilos = input2.nextInt();
      System.out.println("\nEnter capacity like Width:Height:Length \n");
      String cap = input1.nextLine();
      WHL = cap.split(":");
      
      double capacity = (Double.parseDouble(WHL[0]) * Double.parseDouble(WHL[1]) * Double.parseDouble(WHL[2]))/1000;
      
      L = new Luggage(belongsTo,weightKilos,capacity);
      LuggageList.addLuggage(L);
      
      if((i+1)<LuggageList.MAX_COUNT)
          System.out.println("the luggage is belonging to: "+belongsTo+" is added to the list.");
      else 
         System.out.println("Max size of reached!"); 
      
      
    }
    
    
        System.out.println("Here is a list of luggages");
        LuggageList.display();
    
        System.out.println("Which luggage would you like to delete?\n" + "Enter an ID:");
        
        if(!LuggageList.removeLuggage(input1.nextLine()) )
            System.out.println("The luggage does not exist");
        
        LuggageList.display();
        
        System.out.println("Search");
        
        L = LuggageList.getLuggage(input1.nextLine());
        
        if( L != null) {
            System.out.println("Here is the luggage "+L.toString());
        }
        
        
        Luggage highestCapatiy = LuggageList.getHighestCapacityLuggage("");
        System.out.println("-----------------");
        
        System.out.println("The luggage belonging to: "+highestCapatiy.getBelongsTo()+" has the highest capacity of "+highestCapatiy.getCapacity_lt()+ " liters.");
        
        System.out.println("-----------------");
        Luggage ls[] = LuggageList.getAll();
        
    
    
    
    }
    
}

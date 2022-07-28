/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4;

/**
 *
 * @author flashomer
 */
public class sumNumber {
 
    
    public static void sumNumber(int tnumber[], int n) {
            int tnum=0;
            int i;
        for(i=0; i<n; i++){
            tnum += tnumber[i];
        }
        
            System.out.println("The sum of numbers is "+tnum);
    }
    
}

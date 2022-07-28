/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1;

import java.util.Scanner;

/**
 *
 * @author flashomer
 */
public class S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
    Scanner Scaninput = new Scanner(System.in);
    double sonuc = 0;
    

    System.out.println("Enter the amount of water in kilograms: ");
    double kilograms = Scaninput.nextDouble();
        
    System.out.println("Enter the initial temperature: ");
    double temperature = Scaninput.nextDouble();
    
    System.out.println("Enter the final temperature: ");
    double ftemperature = Scaninput.nextDouble();

    sonuc = (kilograms * (ftemperature - temperature) * 4184);
    
    
      System.out.println("The energy needed is: "+sonuc);
     
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3;

import java.util.Scanner;

/**
 *
 * @author flashomer
 */
public class S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner Scaninput = new Scanner(System.in);
      double gpay,fwith,swth;
      
      System.out.println("Enter employee’s name : ");
        String name = Scaninput.nextLine();
      System.out.println("Enter the number of hours worked in a week ");
        int week = Scaninput.nextInt();
      System.out.println("Enter hourly pay rate : ");
        double pay = Scaninput.nextDouble();
      System.out.println("Enter the state tax withholding rate :  ");
        double ftax = Scaninput.nextDouble();
      System.out.println("Enter the state tax withholding rate :  ");
        double stax = Scaninput.nextDouble();
        
      gpay = week * pay;
      fwith = gpay * ftax;
      swth = gpay*stax;
        
      System.out.println("PAYROLL FOR EMPLOYEE ");
      System.out.println("--------------------------------");
      System.out.println("Employee name: "+name);
      
      System.out.println("Hours worked: "+week);
      System.out.println("Pay Rate: $"+pay);
      System.out.println("Gross Pay: $"+gpay);
      
      System.out.println("Deductions: ");
      System.out.println(" Federal withholding (20.0%): $"+fwith);
      System.out.println(" State withholding (9.0%): $"+swth);
      System.out.println(" Total deduction: $"+(fwith+swth));
      System.out.println("Net Pay: $"+(gpay-(fwith+swth)));
      
      
        
    }
    
}

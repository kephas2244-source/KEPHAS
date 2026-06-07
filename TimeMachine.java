/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.timemachine;

import java.util.Scanner;
public class TimeMachine {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       /**
        Let the user enter the seconds
        * Put the calculation part of converting seconds into minutes through division
        * use modulus of 60 since 1 min = 60 seconds
           
        */
              
       // Input Seconds
       System.out.println("Enter seconds");
       int totalSeconds = s.nextInt();
       // Calculation Part
       int minutes = totalSeconds /60;
       int remainingSeconds = totalSeconds % 60;
       
       System.out.print( "Minutes :"+ minutes  );
       System.out.println( "Reamaining Seconds:"+ remainingSeconds );
        
        
        
        
        
    }
}

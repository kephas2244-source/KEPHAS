/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.computearea;

import java.util.Scanner;
public class ComputeArea {

    public static void main(String[] args) {
        
        //. Area of  RECTANGLE
         Scanner s =new Scanner(System.in);
        System.out.println("Enter  the Length");
        int length = s.nextInt();
          System.out.println("Enter  the Width");
          int width = s.nextInt();
          
          int area= length*width;
          
               System.out.println(area);
               System.out.println("The area of a rectangle of length " + length +  " and width " + width + " is "+area);
    }
}


package com.mycompany.p_001.V9.V23;

import java.util.Scanner;

public class NewClass_001
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String myWord1 = myObj.nextLine();      // Reads the first string
        
        System.out.print("Enter your age : ");
        int myNumber = myObj.nextInt();     // Reads the first int
        
        myObj.nextLine();       // We should remind the system that we about to enter string value 
        
        System.out.print("Enter your hometown : ");
        String myWord2 = myObj.nextLine();      // Reads the second string
        
        System.out.println("Hello. My name is " + myWord1 + " and im " + myNumber + ". However im from " + myWord2);
    }
}

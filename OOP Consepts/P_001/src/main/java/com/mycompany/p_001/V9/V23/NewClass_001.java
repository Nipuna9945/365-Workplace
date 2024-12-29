
package com.mycompany.p_001.V9.V23;

import java.util.Scanner;

public class NewClass_001
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        System.out.print("Enter your age : ");
        System.out.print("Enter your hometown : ");
        
        String myWord1 = myObj.nextLine();
        int myNumber = myObj.nextInt();
        String myWord2 = myObj.nextLine();
        
        System.out.println("Hello. My name is " + myWord1 + " and im " + myNumber + ". However im from " + myWord2);
    }
}

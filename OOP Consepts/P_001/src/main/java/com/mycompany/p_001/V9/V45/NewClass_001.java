
package com.mycompany.p_001.V9.V45;

import java.io.File;
import java.io.IOException;

public class NewClass_001
{
    public static void main(String[] args)
    { 
        
        try 
        {
            File myObj = new File("E:\\365-Workplace\\OOP Consepts\\P_001\\src\\main\\java\\com\\mycompany\\p_001\\V9\\V45\\TextDocument.txt");
            if (myObj.createNewFile()) 
            {
                System.out.println("File created: " + myObj.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// Done
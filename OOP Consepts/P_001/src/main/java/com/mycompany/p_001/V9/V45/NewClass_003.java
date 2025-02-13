
package com.mycompany.p_001.V9.V45;

import java.io.File;
import java.io.FileWriter;

public class NewClass_003
{
    public static void main(String[] args)
    {
        File myObj = new File("E:\\365-Workplace\\OOP Consepts\\P_001\\src\\main\\java\\com\\mycompany\\p_001\\V9\\V45\\TextDocument.txt");
        
        if(myObj.exists())
        {
            System.out.println("File name: " + myObj.getName());
            
        }
    }
}

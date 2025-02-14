
package com.mycompany.p_001.V9.V45;

import java.io.File;

public class NewClass_004
{
    public static void main(String[] args)
    {
        File myObj = new File("E:\\365-Workplace\\OOP Consepts\\P_001\\src\\main\\java\\com\\mycompany\\p_001\\V9\\V45\\DeleteDocument.txt");
        
        if(myObj.delete())
        {
            System.out.println("Deleted the file: " + myObj.getName());
        }
        
        else
        {
            System.out.println("Failed to delete the file.");
        }
    }
}

// Done

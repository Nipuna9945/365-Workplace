
package com.mycompany.p_001.V9.V45;

import java.io.FileWriter;

public class NewClass_002
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWriter = new FileWriter("E:\\365-Workplace\\OOP Consepts\\P_001\\src\\main\\java\\com\\mycompany\\p_001\\V9\\V45\\TextDocument.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } 
        catch (Exception e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// Done

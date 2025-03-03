
package com.mycompany.p_001.V9.V32;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewClass_004
{
    public static void main(String[] args)
    {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println("Date and time before : " + myObj);
        
        DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDate = myObj.format(myFormatterObj);
        System.err.println("After the format : " + formatedDate);
    }
}


//Not yet
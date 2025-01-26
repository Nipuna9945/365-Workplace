
package com.mycompany.p_001.V9.V37;

import java.util.HashSet;

public class NewClass_004
{
    public static void main(String[] args)
    {
        HashSet<String> myObj = new HashSet<>();
        
        myObj.add("Volvo");
        myObj.add("BMW");
        myObj.add("Ford");
        myObj.add("BMW");
        myObj.add("Mazda");
        
        myObj.clear();
        
        System.out.println(myObj);
    }
}

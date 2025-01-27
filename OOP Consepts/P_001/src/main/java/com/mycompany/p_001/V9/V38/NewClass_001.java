
package com.mycompany.p_001.V9.V38;

import java.util.ArrayList;
import java.util.Iterator;

public class NewClass_001
{
    public static void main(String[] args)
    {
        ArrayList<String> myObj = new ArrayList<>();
        
        myObj.add("Volvo");
        myObj.add("BMW");
        myObj.add("Ford");
        myObj.add("BMW");
        myObj.add("Mazda");
        
        Iterator<String> it = myObj.iterator();
        
        System.out.println(it);
    }
}

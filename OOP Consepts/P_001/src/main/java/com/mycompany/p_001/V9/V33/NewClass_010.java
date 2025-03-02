
package com.mycompany.p_001.V9.V33;

import java.util.ArrayList;
import java.util.Collections;


public class NewClass_010
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(46);
        numbers.add(61);
        numbers.add(94);
        numbers.add(17);
        numbers.add(24);
        
        Collections.sort(numbers);
        
        for (Integer i : numbers)
        {
            System.out.println(i);
        }
    }
}


//Not yet
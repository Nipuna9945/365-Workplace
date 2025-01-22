
package com.mycompany.p_001.V9.V35;

import java.util.ArrayList;
import java.util.Collections;

public class NewClass_002
{
    public static void main(String[] args)
    {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(49);
        number.add(14);
        number.add(37);
        number.add(88);
        number.add(95);
        number.add(63);
        
        Collections.sort(number);
        
        for (Integer i : number)
        {
            System.out.println(i);
        }
    }
}

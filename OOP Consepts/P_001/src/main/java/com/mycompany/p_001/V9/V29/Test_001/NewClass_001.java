
package com.mycompany.p_001.V9.V29.Test_001;

public class NewClass_001
{
    enum Level
    {
        LOW,
        MEDIUM,
        HIGH
    }
    
    public static void main(String[] args)
    {
        for (Level myLevel : Level.values())
        {
            System.out.println(myLevel);
        }
    }
}

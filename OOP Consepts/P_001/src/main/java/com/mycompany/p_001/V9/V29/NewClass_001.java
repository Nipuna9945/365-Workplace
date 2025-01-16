
package com.mycompany.p_001.V9.V29;

public class NewClass_001
{
    enum Level
    {
        HIGH,
        MEDIUM,
        LOW
    }
    
    public static void main(String[] args)
    {
        Level myLevel = Level.HIGH;
        
        switch (myLevel)
        {
            case HIGH:
                System.out.println("This level is high");
                break;
            
            case MEDIUM:
                System.out.println("This level is medium");
                break;
            
            case LOW:
                System.out.println("This level is low");
                break;
                
            default:
                throw new AssertionError();
        }
    }
}

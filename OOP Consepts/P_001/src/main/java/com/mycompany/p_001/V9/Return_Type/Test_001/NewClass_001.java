
package com.mycompany.p_001.V9.Return_Type.Test_001;

public class NewClass_001 
{
    static int myMethod(int x)
    {
        //return x = 531;
        
        return 531 + x;     // x value add to this 531 value
    }
    
    public static void main(String[] args) 
    {
        System.out.println(myMethod(531));
    }
}

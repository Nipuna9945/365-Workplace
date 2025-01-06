
package com.mycompany.p_001.V9.V26.Test_001;


class outerClass
{
    int x = 45;
    
    
    class innerClass
    {
        int y = 98;
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        outerClass myOuter = new outerClass();
        outerClass.innerClass myInner = myOuter.new innerClass();
        
        System.out.println("X value is " + myOuter.x);
        System.out.println("Y value is " + myInner.y);
        System.out.println(myOuter.x + myInner.y);
    }
}

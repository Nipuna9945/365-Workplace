
package com.mycompany.p_001.V9.V26.Test_002;



class OuterClass
{
    int x = 57;
    
     class innerClass
    {
        int y = 38;
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        //OuterClass.innerClass myInner = new OuterClass.innerClass();
        //System.out.println(myInner.y);
        
        OuterClass myOuter = new OuterClass();
        OuterClass.innerClass myInner = myOuter.new innerClass();
        
        System.out.println(myOuter.x + myInner.y);
        
    }
}

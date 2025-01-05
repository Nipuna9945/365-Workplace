
package com.mycompany.p_001.V9.V26;


class OuterClass
{
    int x = 26;

    class InnerClass
    {
        int y = 13;
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        OuterClass myOuterClass = new OuterClass();
        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
        
        System.out.println(myOuterClass.x + myInnerClass.y);
    }
}


package com.mycompany.p_001.V9.V42;

public class NewClass_001 extends Thread
{
    public static void main(String[] args)
    {
        NewClass_001 myTRD = new NewClass_001();
        myTRD.start();
        
        System.out.println("This code is outside of the thread");
    }
    
    public void run()
    {
        System.out.println("This code is running in a thread");
    }
}

//done

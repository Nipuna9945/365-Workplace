
package com.mycompany.p_001.V9.V42;

public class NewClass_002 implements Runnable
{
    public static void main(String[] args)
    {
        NewClass_002 myObj = new NewClass_002();
        Thread myThread = new Thread(myObj);
        myThread.start();
        
        System.out.println("This code is outside of the thread");
    }

    @Override
    public void run()
    {
        System.out.println("This code is running in a thread");
    }
}

//done
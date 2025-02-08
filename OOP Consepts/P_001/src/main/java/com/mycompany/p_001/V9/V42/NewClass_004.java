
package com.mycompany.p_001.V9.V42;

public class NewClass_004 extends Thread
{
    public static int i = 0;
    
    public static void main(String[] args)
    {
        NewClass_004 myObj = new NewClass_004();
        myObj.start();
        
        while(myObj.isAlive())
        {
            System.out.println("Waiting...");
        }
        
        System.out.println("Main: " + i);
        i++;
        System.out.println("Main: " + i);
    }
    public void run()
    {
        i++;
    }
}


//done
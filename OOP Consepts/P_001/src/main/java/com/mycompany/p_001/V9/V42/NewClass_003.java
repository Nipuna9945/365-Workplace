
package com.mycompany.p_001.V9.V42;

public class NewClass_003 extends Thread
{
    public static int i = 0;
    
    public static void main(String[] args)
    {
        NewClass_003 myObj = new NewClass_003();
        myObj.start();
        
        System.out.println(i);
        i++;
        System.out.println(i);
    }
    
    public void run()
    {
        i++;
    }
}

//done

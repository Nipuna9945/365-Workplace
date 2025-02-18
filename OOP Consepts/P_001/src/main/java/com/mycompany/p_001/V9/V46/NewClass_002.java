
package com.mycompany.p_001.V9.V46;

import java.util.Scanner;

public class NewClass_002
{
    public static void main(String[] args)
    {
        int x, y, sum;
        
        Scanner myObj= new Scanner(System.in);
        System.out.println("Type a number: ");
        x = myObj.nextInt();
        
        System.out.println("Type another number: ");
        y = myObj.nextInt();
        
        sum = x + y;
        System.out.println("Sum is: " + sum);
    }
}

//Done  

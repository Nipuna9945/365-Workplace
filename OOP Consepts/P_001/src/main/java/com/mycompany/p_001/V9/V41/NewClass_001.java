
package com.mycompany.p_001.V9.V41;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewClass_001
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("boiz", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello boiz whats up");
        
    }
}

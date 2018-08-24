package com.indunil.test5;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String p = "<p>This is my sample paragraph</p>";

        System.out.println(StringEscapeUtils.unescapeHtml4(p));
    }
}

package com.MyFirstMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	
    	
    	Class.forName("com.mysql.jdbc.Driver");
        System.out.println( "!!!!!!Driver Loaded!!!!!!!!!!" );
    }
}

package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tester tester = new Tester("John", "Doe", 3, "Advanced", 2000);
        Tester.printTesterInfo(tester);
    }
}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello world!");
        // 8 primitives in java
        int age = 25;
        byte numberOfBook = 40;
        long population= 67676788787777787L;
        short countries= 234;

        float salary = 40000f;
        double price = 78797.89d;

        boolean isOG = false;
        char school = 'g'; // single quotes

        String name = ""; // string is a class not a data-type in java



        for (int i = 1; i <= 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
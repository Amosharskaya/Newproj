package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        method1();
        System.out.println("GIT welcome!");
        System.out.printf("The END!");
    }

    public static void method1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

}

package git;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Чтобы считывать строки с консоли
        int num = 5;

        WelcomeSwitch welcomeSwitch = new WelcomeSwitch();
        welcomeSwitch.thisIsSwitch(num);

        WelcomeStringBuilder welcomeStringBuilder = new WelcomeStringBuilder();
        welcomeStringBuilder.makeBuilder();

        WelcomeArray welcomeArray = new WelcomeArray();
        welcomeArray.doSomething(230, 240, 599, 593, 700);
        welcomeArray.iterateOverArray();
        welcomeArray.newIterateOverArray();


        // Экранирование
        String text = "First line\n \"Ковычки\""
                + "Second line"; // Escape sequences - Экранирование

        String textBlock = """ 
                Экранирование: First line
                Экранирование: "Second line"
                Экранирование: Third line
                """; // Тройные кавычки
        System.out.println(textBlock);
        // Экранирование


        //Stream API
        long[] argsNum = {1, 2, 3, 4};
        double result = Arrays.stream(argsNum).average().orElse(0);
        Arrays.stream(argsNum).forEach(System.out::println); // Распечатать массив без for
        //Stream API

        

    }

}




package src.main.java.com.github.valentina810.javasyntaxpro.alllettersaresmall;

import java.util.Scanner;

/**
 * task11.task1120
 * Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре. Исправь ошибку в коде, чтобы программа работала корректно.
 * <p>
 * Требования:
 * Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
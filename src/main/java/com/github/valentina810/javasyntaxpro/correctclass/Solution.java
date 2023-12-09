package src.main.java.com.github.valentina810.javasyntaxpro.correctclass;

/**
 * task11.task1116
 * Исправь ошибки в коде, чтобы программа компилировалась и работала.
 * <p>
 * Требования:
 * Программа должна компилироваться и работать.
 * В программе должен быть публичный класс Solution.
 * В программе должен быть класс Cat
 */
public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}

class Cat {
    String name = "Tom";
}
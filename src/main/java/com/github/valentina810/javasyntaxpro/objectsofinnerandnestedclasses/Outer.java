package src.main.java.com.github.valentina810.javasyntaxpro.objectsofinnerandnestedclasses;

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }

    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
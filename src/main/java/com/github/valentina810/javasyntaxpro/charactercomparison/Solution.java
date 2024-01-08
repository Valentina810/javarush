package src.main.java.com.github.valentina810.javasyntaxpro.charactercomparison;

import java.util.function.BiFunction;

/**
 * task12.task1208
 * Метод compare(Character, Character) принимает два символа, выводит в консоли результат их сравнения.
 * Реализуй метод compare(Character, Character), который должен правильно сравнивать символы.
 * Если код первого символа больше второго, вывести "больше".
 * Если код первого символа меньше второго, вывести "меньше".
 * Если код первого символа равен второму, вывести "равны".
 * <p>
 * Требования:
 * Исправь работу метода compare(Character, Character) с помощью изменения одного условия.
 */
public class Solution {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('ы', 'ы');
    }

    public static void compare(Character first, Character second) {
        BiFunction<Character, Character, String> compareFunction = (a, b) ->
                a.equals(b) ? "равны" :
                        a > b ? "больше" :
                                a < b ? "меньше" :
                                        "А как такое может быть???";

        System.out.println(compareFunction.apply(first, second));
    }
}
package src.main.java.com.github.valentina810.javasyntaxpro.divisionmethod;

import java.util.function.BiPredicate;

/**
 * task12.task1205
 * Реализуй метод divide(double a, double b) так, чтобы в консоли выводился результат деления числа a на число b.
 * Должно выводиться следующее значение:
 * Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
 * a положительное и b равно 0;
 * a равно Double.POSITIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
 * a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
 * Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
 * a отрицательное и b равно 0;
 * a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
 * a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
 * Double.NaN, если верен любой из следующих пунктов:
 * a равно 0 и b равно 0;
 * хотя бы один из операндов равен Double.NaN;
 * a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
 * a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
 * a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
 * a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
 * Иначе выводить результат деления a на b.
 * Требования:
 * Метод divide(double a, double b) должен выводить в консоли результат деления числа a на число b.
 * Метод divide(double a, double b) должен выводить в консоли "Infinity" согласно пункту 1 условия.
 * Метод divide(double a, double b) должен выводить в консоли "-Infinity"согласно пункту 2 условия.
 * Метод divide(double a, double b) должен выводить в консоли "NaN" согласно пункту 3 условия.
 */
public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        BiPredicate<Double, Double> checkInfinity = (x, y) ->
                (x * y == 0) && (Math.abs(x) == Double.POSITIVE_INFINITY || Math.abs(y) == Double.POSITIVE_INFINITY);

        BiPredicate<Double, Double> checkNaN = (x, y) ->
                (x == 0 && y == 0) ||
                        (Double.isNaN(x) || Double.isNaN(y)) ||
                        (x.equals(y) && Math.abs(x) == Double.POSITIVE_INFINITY) ||
                        (x == -y && x + y == 0);

        String result = checkInfinity.test(a, b) ? (a > 0 ? "Infinity" : "-Infinity") :
                checkNaN.test(a, b) ? "NaN" :
                        String.valueOf((a / b));

        System.out.println(result);
    }
}
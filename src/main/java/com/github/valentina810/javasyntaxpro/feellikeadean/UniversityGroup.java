package src.main.java.com.github.valentina810.javasyntaxpro.feellikeadean;

import java.util.ArrayList;
import java.util.List;

/**
 * task11.task1123
 * У нас есть группа в университете и метод, который должен отчислять конкретного студента, но он почему-то не работает.
 * Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.
 * <p>
 * Требования:
 * В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
 * В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
 * Метод exclude должен удалять из списка переданного студента.
 */
public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        // for (String student : students) {
        //     if (student.equals(excludedStudent)) {
        //         students.remove(student);
        //     }
        // }
        students.removeIf(x -> x.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
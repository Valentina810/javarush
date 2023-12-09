package src.main.java.com.github.valentina810.javasyntaxpro.theengineistheheartofthecar;

/**
 * task11.task1107
 * Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
 * В классе Car создай внутренний класс (inner class) Engine. В классе Engine
 * создай boolean поле isRunning, которое принимает значение true, если двигатель
 * запущен, и false в противном случае. Также в этот класс добавь методы start и stop,
 * которые будут запускать/останавливать двигатель (устанавливать соответствующее
 * значение полю isRunning).
 * Чтобы использовать двигатель, создай поле engine типа Engine в классе Car.
 * <p>
 * Требования:
 * В классе Car нужно создать внутренний класс (inner class) Engine.
 * В классе Engine должно существовать приватное поле isRunning типа boolean.
 * В классе Engine должен существовать публичный метод void start, который устанавливает
 * значение true полю
 */
public class Car {
    private Engine engine;

    /**
     * Статические классы еще называют вложенными (static nested class),
     * нестатические просто называют внутренними классами (inner class).
     */
    class Engine {
        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }
    }
}

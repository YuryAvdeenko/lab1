package bsu.rfe.java.group8.lab1.Yury.varA4;

public class Cheese extends Food {

    public Cheese() {          // конструктор инициализации
        super("Сыр");    // вызывает конструктор базового класса

    }

    public void consume() {        // реализация метода consume (что произошло с объектом)

        System.out.println(this + " съеден");
    }
}


package bsu.rfe.java.group8.lab1.Yury.varA4;

public class Apple extends Food {

    private String size;       // из-за создания нового поля нужно переопределить методы equals и toString
    Double calories = null;

    public Apple(String size){     // конструктор инициализации
        super("Яблоко");     // вызывает конструктор базового класса
        this.size = size;
    }

    public String toString(){  // переопределение метода преобразования в строку
        return super.toString() + " размера " + size.toUpperCase();
    }

    public String getSize(){        // возвращает размер яблока
        return size;
    }

    public void setSize(String size){      //  изменение размера яблока
        this.size = size;
    }

    public void consume() {        // реализация метода consume (что произошло с объектом)
    System.out.println(this + " съедено");
    }

}

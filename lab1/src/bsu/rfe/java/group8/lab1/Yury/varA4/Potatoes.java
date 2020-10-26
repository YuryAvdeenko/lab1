package bsu.rfe.java.group8.lab1.Yury.varA4;

public class Potatoes extends Food {
    private String type;
    private Double calories = null;

    public Potatoes(String type)
    {
        super("Картошка");
        this.type = type;
    }
    public void consume()           // реализация метода consume (что произошло с объектом)
    {
        System.out.println(this + " съедена");
    }

    public String getSize()   // возвращает тип картошки
    {
        return type;
    }

    public void setSize(String type)  // изменение типа картошки
    {
        this.type = type;
    }

    public String toString()       // переопределение метода преобразования в строку
    {
        return super.toString() + " " + type.toUpperCase() ;
    }
}


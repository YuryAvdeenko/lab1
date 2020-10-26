package bsu.rfe.java.group8.lab1.Yury.varA4;

public abstract class Food implements Consumable {

    String name = null;

    public Food(String name){    // конструктор инициализации
        this.name = name;
    }

    public boolean  equals(Object arg0){      //метод сравнения
            if (!(arg0 instanceof Food )) return false;
            if (name == null || ((Food) arg0).name == null) return false;
            return name.equals(((Apple)arg0).name);
    }

    public String toString(){    //метод преобразования в строку
        return name;
    }

    public String getName(){   //возвращает имя
        return name;
    }

    public void setName(String name){   //изменение имени
        this.name = name;
    }
}

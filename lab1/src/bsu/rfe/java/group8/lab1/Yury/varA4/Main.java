package bsu.rfe.java.group8.lab1.Yury.varA4;

public class Main {

    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int i = 0;

        for(String arg: args){
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")){
                breakfast[i] = new Cheese();
            } else if(parts[0].equals(("Apple"))){
                breakfast[i] = new Apple(parts[1]);
            } else if(parts[0].equals(("Potatoes"))) {
                breakfast[i] = new Potatoes(parts[1]);
            }
            i++;
        }
        System.out.println("Завтрак: ");    //выводим завтрак таким,каким он был первоначально
        for (Food item : breakfast) {
             if (item != null){
                 item.consume();
             } else {
                 break;
             }
        }
    }
}

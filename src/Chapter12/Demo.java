package Chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args){
        //setDemo();
        mapDemo();
    }
    public static void setDemo(){
        Set <String> fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Lemon");
      /*  System.out.println(fruit.size());
        System.out.println(fruit);

        // Looping in collections
        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for(String item : fruit){
            System.out.println(item);
        } */

        fruit.forEach (item -> System.out.println(item));



    }
    public static void mapDemo(){
        Map <String , Integer> fruitCalories = new HashMap();
        fruitCalories.put("Apple",95);
        fruitCalories.put("lemon",20);
        fruitCalories.put("banana",105);
        fruitCalories.put("lemon",17);

     /*   for(var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }
      */

        fruitCalories.forEach(
                (k,v) -> System.out.println(" Fruit " + k + " Calories " + v)
        );

    }
}

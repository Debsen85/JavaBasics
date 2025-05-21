
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Car {

    public void start() {
        System.out.println("Engine started!");
    }

    public void accelerate() {
        System.out.println("Accelerate!");
    }

    public void brake() {
        System.out.println("Brake!");
    }

    public void stop() {
        System.out.println("Engine stopped!");
    }

}

class Ferrari extends Car {

    public Ferrari() {
    }
    
}

class Lamborghini extends Car {

    public Lamborghini() {
    }
    
}

public class Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Apple");
        list.add("Mango");
        list.add("Pear");

        System.out.println((String)list.get(1));

        List<String> animalList = new ArrayList<>();
        
        animalList.add("Panda");
        animalList.add("Lion");
        animalList.add("Tiger");

        System.out.println(animalList.get(1));

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Debayan");
        map.put(2, "Rohit");
        map.put(3, "Sneha");

        System.out.println(map);

        Ferrari car1 = new Ferrari();
        Ferrari car2 = new Ferrari();
        Ferrari car3 = new Ferrari();

        Lamborghini car4 = new Lamborghini();
        Lamborghini car5 = new Lamborghini();
        Lamborghini car6 = new Lamborghini();

        List<Ferrari> listFerrari = new ArrayList<>();
        List<Lamborghini> listLamborghini = new ArrayList<>();
        List<? super Car> listCar = new ArrayList<>();

        listFerrari.add(car1);
        listFerrari.add(car2);
        listFerrari.add(car3);

        listLamborghini.add(car4);
        listLamborghini.add(car5);
        listLamborghini.add(car6);

        for (Ferrari car: listFerrari) {
            listCar.add(car);
        }

        for (Lamborghini car: listLamborghini) {
            listCar.add(car);
        }

        System.out.println(listFerrari);
        System.out.println(listLamborghini);
        System.out.println(listCar);
        
    }
}

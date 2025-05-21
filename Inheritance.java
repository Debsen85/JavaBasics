class Car {

    String model;
    String engine;
    int year;
    double price;

    public Car(String engine, String model, double price, int year) {
        this.engine = engine;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.printf("%s is the car model, %s is it's engine, Rs. %s is it's price and was made in the year %s.\n", this.model, this.engine, this.price, this.year);
    }

}

class Ferrari extends Car {

    public Ferrari(String engine, String model, double price, int year) {
        super(engine, model, price, year);
    }

}

class Lamborghini extends Car {
    
    public Lamborghini(String engine, String model, double price, int year) {
        super(engine, model, price, year);
    }
    
}

public class Inheritance {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari("V6", "f10", 1200000.0, 2020);
        Lamborghini lamborghini = new Lamborghini("V8", "countach", 1500000.0, 2018);

        ferrari.display();
        lamborghini.display();
    }
}

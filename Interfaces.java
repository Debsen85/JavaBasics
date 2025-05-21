

interface Computer {

    public void display();

}

class Windows implements Computer {

    String make;
    String processor;
    String graphics;
    String ram;
    String storage;

    public Windows(String graphics, String make, String processor, String ram, String storage) {
        this.graphics = graphics;
        this.make = make;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void display() {
        System.out.printf("%s is a windows laptop having %s processor with %s graphics containing a storage of %s TB and %s GB of RAM.\n", this.make, this.processor, this.graphics, this.storage, this.ram);
    }

}

class MacOs implements Computer {

    String make;
    String processor;
    String graphics;
    String ram;
    String storage;

    public MacOs(String graphics, String make, String processor, String ram, String storage) {
        this.graphics = graphics;
        this.make = make;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void display() {
        System.out.printf("%s is a windows laptop having %s processor with %s graphics containing a storage of %s TB and %s GB of RAM.\n", this.make, this.processor, this.graphics, this.storage, this.ram);
    }

}

public class Interfaces {
    public static void main(String[] args) {
        Computer lenevo = new Windows("RTX 5090", "Lenevo Legion", "Intel i9-14900HX", "32", "2");
        Computer macbookProM4 = new MacOs("Integrated", "macbookProM4", "M4 Max", "64", "1");

        lenevo.display();
        macbookProM4.display();
    }
}

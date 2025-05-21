class Area {

    public int areaShape(int a) {
        return (a * a);
    }

    public int areaShape(int a, int b) {
        return (a * b);
    }

    public double areaShape(double r) {
        return (3.14 * r * r);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.areaShape(5));
        System.out.println(area.areaShape(5, 4));
        System.out.println(area.areaShape(5.0));
    }
}

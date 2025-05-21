class People {

    String name;
    int age;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greet(People person) {
        System.out.println("Hello my name is " + person.name + " and my age is " + person.age + ".");
    }
}

public class Constructor {
    public static void main(String[] args) {
        People people = new People(27, "Debayan Senapati");
        people.greet(people);
    }
}
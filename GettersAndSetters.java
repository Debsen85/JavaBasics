class Person {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greet(Person person) {
        System.out.println("Hello my name is " + person.name + " and my age is " + person.age + ".");
    }

}

public class GettersAndSetters {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Debayan Senapati");
        person.setAge(27);
        person.greet(person);
    }
}
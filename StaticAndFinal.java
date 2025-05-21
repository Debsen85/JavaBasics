class Human {

    private final static String SPICIES = "Homo Sapiens" ;
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getSpicies() {
        return SPICIES;
    }
    
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
}

public class StaticAndFinal {
    public static void main(String[] args) {
        Human human = new Human("Bittu", 29);
        System.out.println(Human.getSpicies());
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }
}

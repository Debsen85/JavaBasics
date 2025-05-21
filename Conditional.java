public class Conditional {
    public static void main(String[] args) {
        int age = 50;
        if (age < 18) {
            System.out.println("Cannot vote!");
        } else if (age >= 18 && age < 61) {
            System.out.println("Vote please!");
        } else {
            System.out.println("Too old to vote!");
        }
    }
}

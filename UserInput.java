
import java.util.Scanner;

class UserInput {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("My name is " + name + " and my age is " + age);
        scanner.close();
    }
}

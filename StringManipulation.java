public class StringManipulation {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("");
        string.append("Debayan Senapati ");
        string.append("27 ");
        string.append("Chennai.");
        System.out.println(string.toString());
        for (int i = 1; i <= 10; i ++) {
            System.out.printf("%2d current number.\n", i);
        }
    }
}

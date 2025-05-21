public class StringArrays {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Debayan Senapati";
        for (int i = 1; i < 3; i ++) {
            names[i] = "JunkoFunko";
        }
        for (int j = 3; j < names.length; j ++) {
            names[j] = "HeroZero";
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}

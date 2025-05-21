import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerIntroduction {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "example.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int line = 1;
        while(scanner.hasNextLine()) {
            System.out.println(line + " : " + scanner.nextLine());
            line ++;
        }
        scanner.close();
    }
}

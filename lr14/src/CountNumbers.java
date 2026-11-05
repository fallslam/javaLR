import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter("f.txt");
        writer.println("10\n65\n45\n80\n23\n90\n60\n12\n77\n5");
        writer.close();


        int count = 0;
        Scanner scanner = new Scanner(new File("f.txt"));

        while (scanner.hasNextInt()) {
            if (scanner.nextInt() > 60) {
                count++;
            }
        }
        scanner.close();

        System.out.println("Количество чисел больше 60: " + count);
    }
}

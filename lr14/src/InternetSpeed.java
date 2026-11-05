import java.io.File;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class InternetSpeed {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        PrintWriter writer = new PrintWriter("speed.txt");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите скорость " + i + " из 15 (например, 95.5): ");
            double speed = input.nextDouble();
            writer.println(speed);
        }
        writer.close();

        double totalSpeed = 0;
        int count = 0;

        Scanner fileScanner = new Scanner(new File("speed.txt"));
        fileScanner.useLocale(Locale.US);

        while (fileScanner.hasNextDouble()) {
            totalSpeed += fileScanner.nextDouble();
            count++;
        }
        fileScanner.close();

        double average = totalSpeed / count;
        System.out.printf( "\nСредняя скорость интернета: %.2f Мбит/с\n", average);
    }
}

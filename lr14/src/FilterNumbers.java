import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class FilterNumbers {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("f.txt");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Введите целое число " + i + " из 10: ");
            int num = input.nextInt();
            writer.println(num);
        }
        writer.close();

        int count = 0;
        System.out.println("\nЧисла из файла:");

        Scanner fileScanner = new Scanner(new File("f.txt"));
        while (fileScanner.hasNextInt()) {
            int num = fileScanner.nextInt();
            System.out.print(num + " ");

            if (num % 4 == 0 && num % 8 != 0) {
                count++;
            }
        }
        fileScanner.close();

        System.out.println("\n\nКоличество чисел (кратных 4 и не кратных 8): " + count);
    }
}

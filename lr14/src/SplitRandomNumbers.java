import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class SplitRandomNumbers {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        PrintWriter writerF = new PrintWriter("f.txt");


        for (int i = 0; i < 20; i++) {
            writerF.println(random.nextInt(100) + 1);
        }
        writerF.close();

        Scanner scannerF = new Scanner(new File("f.txt"));
        PrintWriter writerG = new PrintWriter("g.txt");
        PrintWriter writerH = new PrintWriter("h.txt");

        while (scannerF.hasNextInt()) {
            int num = scannerF.nextInt();
            if (num % 9 == 0 && num % 2 != 0) {
                writerG.println(num);
            } else {
                writerH.println(num);
            }
        }

        scannerF.close();
        writerG.close();
        writerH.close();

        System.out.println("Числа успешно распределены по файлам g.txt и h.txt!");
    }
}

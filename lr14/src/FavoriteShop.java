import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class FavoriteShop {
    public static void main(String[] args) throws Exception {
        File file = new File("shop.txt");


        PrintWriter writer = new PrintWriter(file);
        writer.println("Название: Мой Любимый Книжный");
        writer.println("Категория: Книги и канцелярия");
        writer.println("Адрес: ул. Пушкина, 10");
        writer.close();


        System.out.println("Размер файла: " + file.length() + " байт");


        System.out.println("\nИнформация из файла:");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

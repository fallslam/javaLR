import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите задание");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Введите целое число");
                int number = scanner.nextInt();
                String strNumber = String.valueOf(number);
                System.out.println("Длина строки: " + strNumber.length());
                break;
            case 2:
                System.out.print("Введите текст: ");
                String text = scanner.nextLine();

                String w = text.replaceAll("[aeiouyаеёиоуыэюя]", "");
                System.out.println("Результат без гласных: " + w);
                break;

            case 3:
                Employee[] employees = new Employee[] {
                        new Employee("Шимонович", 4.000),
                        new Employee("Козаченко", 5.000),
                        new Employee("Колосович", 100.2000)
                };
                Report.generateReport(employees);
                break;

            case 4:
                String testString = "a!a a@a a#a a$a a%a a^a a a aba a1a";
                System.out.println("Исходная строка: " + testString);
                System.out.println("Результаты поиска:");

                Pattern pattern = Pattern.compile("a[^a-zA-Zа-яА-ЯёЁ\\s]a");
                Matcher matcher = pattern.matcher(testString);

                while (matcher.find()) {
                    System.out.println("Найдено совпадение: " + matcher.group());

                }
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        scanner.close();
    }
}

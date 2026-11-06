
public void main() {
    System.out.print("Выберите 1-3");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    switch (a) {
        case 1:
            int sum = 0;
            System.out.print("Введите трех значное число");
            int number = s.nextInt();
            do {
                sum += number % 10;
                number /= 10;
            }
            while (number < 0);
            System.out.print(sum);
            break;
        case 2:
            System.out.print("Введите температуру");
            int temp = s.nextInt();
            if (temp > 40) {
                System.out.print("Экстрим");
            } else if (temp >= 20 && temp <= 40) {
                System.out.print("Тепло");
            } else if (temp >= 0 && temp <= 19) {
                System.out.print("Прохладно");
            } else if (temp < 0) {
                System.out.print("Мороз");
            }
            break;
        case 3:
            int num;
            System.out.print("Введите свое число : ");
            num = s.nextInt();
            int kol = 0;
            int tamp;
            while (num > 0) {
                tamp = num % 10;
                if (tamp == 5) {
                    kol++;
                }
                num /= 10;
            }
            System.out.println(kol);
            break;
        default:
            System.out.println("Ошибка введите 1-3");

    }
}



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Dancer> dancers = new ArrayList<>(Arrays.asList(
                new Dancer(1, "Лиза",  "Денс",       2, Arrays.asList(5, 4, 5)),
                new Dancer(2, "Женя",  "ДенсКрутой", 1, Arrays.asList(2, 3, 2)),
                new Dancer(2, "еня",   "ДенсКрутой", 1, Arrays.asList(2, 3, 2)),
                new Dancer(3, "Толя",  "ДенсПростой",3, Arrays.asList(4, 4, 5)),
                new Dancer(4, "Рома",  "Мексиканский",2, Arrays.asList(3, 3, 3)),
                new Dancer(5, "Леша",  "Грущинский", 1, Arrays.asList(5, 5, 4)),
                new Dancer(6, "Дима",  "Хип-хоп",    2, Arrays.asList(1, 2, 1))
        ));

        System.out.println("Исходный список:");
        Iterator<Dancer> it = dancers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        DancerService.removeWeak(dancers);
        DancerService.promote(dancers);

        System.out.println("\nПосле обработки:");
        it = dancers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        DancerService.printDancers(dancers, 2);
        System.out.println();
        DancerService.printDancers(dancers, 3);

        System.out.println();
        DancerService.printRanking(dancers);
    }
}
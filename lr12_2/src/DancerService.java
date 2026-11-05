import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DancerService {


    public static void removeWeak(List<Dancer> dancers) {
        Iterator<Dancer> it = dancers.iterator();
        while (it.hasNext()) {
            if (it.next().getAverageScore() < 3) {
                it.remove();
            }
        }
    }

    public static void promote(List<Dancer> dancers) {
        Iterator<Dancer> it = dancers.iterator();
        while (it.hasNext()) {
            Dancer d = it.next();
            if (d.getAverageScore() >= 4) {
                d.setLevel(d.getLevel() + 1);
            }
        }
    }

    public static void printDancers(List<Dancer> dancers, int level) {
        System.out.println("Уровень " + level + " ");
        Iterator<Dancer> it = dancers.iterator();
        while (it.hasNext()) {
            Dancer d = it.next();
            if (d.getLevel() == level) {
                System.out.println(d);
            }
        }
    }

    public static void printRanking(List<Dancer> dancers) {
        dancers.sort(new Comparator<Dancer>() {
            @Override
            public int compare(Dancer a, Dancer b) {
                int byScore = Double.compare(b.getAverageScore(), a.getAverageScore());
                if (byScore != 0) return byScore;
                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println(" Рейтинг ");
        Iterator<Dancer> it = dancers.iterator();
        while (it.hasNext()) {
            Dancer d = it.next();
            System.out.println(d.getId() + "  " + d.getName() + " " + d.getAverageScore());
        }
    }
}
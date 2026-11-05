
public class Main {
    public static void main(String[] args) {
        Team t1 = new Team("A", "football", 11);
        Team t2 = new Team("B", "basketball", 5);
        Team t3 = new Team("C", "hockey", 6);
        Team t4 = new Team("D", "volleyball", 6);
        Team t5 = new Team("E", "tennis", 2);

        System.out.println("Среднее число игроков: " + Team.getAveragePlayers());

        System.out.println("Команда 1: " + t1.getName() + ", игроков: " + t1.getPlayers());
        t1.setPlayers(15);
        System.out.println("После изменения: " + t1.getPlayers());
        System.out.println("Новое среднее: " + Team.getAveragePlayers());
    }
}
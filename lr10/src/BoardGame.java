public class BoardGame implements Playable, Saveable {
    String name;
    int players;
    boolean saved = false;

    public BoardGame(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public void play() {
        System.out.println("Играем в настольную игру: " + name + " (" + players + " игроков)");
    }

    public void pause() {
        System.out.println("Пауза в игре: " + name);
    }

    public void stop() {
        System.out.println("Остановили игру: " + name);
    }

    public void save() {
        saved = true;
        System.out.println("Сохранили настольную игру: " + name);
    }

    public void load() {
        System.out.println("Загрузили настольную игру: " + name);
    }

}
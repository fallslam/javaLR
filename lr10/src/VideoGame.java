public class VideoGame implements Playable, Saveable {
    String name;
    String platform;
    boolean saved = false;

    public VideoGame(String name, String platform) {
        this.name = name;
        this.platform = platform;
    }

    public void play() {
        System.out.println("Играем в видеоигру: " + name + " на " + platform);
    }

    public void pause() {
        System.out.println("Пауза в игре: " + name);
    }

    public void stop() {
        System.out.println("Остановили игру: " + name);
    }

    public void save() {
        saved = true;
        System.out.println("Сохранили видеоигру: " + name);
    }

    public void load() {
        System.out.println("Загрузили видеоигру: " + name);
    }


}
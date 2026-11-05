public class Main {
    public static void main(String[] args) {
        RockSong rock = new RockSong("Рамштайн", "Олег", 215, true);
        rock.displayInfo();
        rock.playSolo();
        ClassicalSong classic = new ClassicalSong("Ду хаст", "Олег", 800, "Рок оркестр");
        classic.displayInfo();
        classic.conduct();

    }
}
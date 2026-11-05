class Music {
    protected String title;
    protected String artist;
    protected int duration;

    public Music(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getGenre() {
        return "Неизвестно";
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Длительность: " + duration + " сек.");
        System.out.println("Жанр: " + getGenre());
    }
}

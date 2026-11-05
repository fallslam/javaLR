class RockSong extends Music {
    private boolean guitarSolo;

    public RockSong(String title, String artist, int duration, boolean guitarSolo) {
        super(title, artist, duration);
        this.guitarSolo = guitarSolo;
    }

    @Override
    public String getGenre() {
        return "Рок";
    }

    public void playSolo() {
        if (guitarSolo) {
            System.out.println("Играет гитарное соло!");
        } else {
            System.out.println("В этой песне нет соло.");
        }
    }
}

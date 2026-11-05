class Team {
    private String name;
    private String sport;
    private int players;

    private static int totalTeams = 0;
    private static int totalPlayers = 0;


    Team(String name, String sport, int players) {
        this.name = name;
        this.sport = sport;
        this.players = players;
        totalTeams++;
        totalPlayers += players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        totalPlayers = totalPlayers - this.players + players;
        this.players = players;
    }


    public static int getTotalTeams() {
        return totalTeams;
    }

    public static int getTotalPlayers() {
        return totalPlayers;
    }

    public static double getAveragePlayers() {
        return (double) totalPlayers / totalTeams;

    }
}

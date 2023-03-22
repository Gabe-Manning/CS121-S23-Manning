public class Player {
    String name;
    String role;
    double kills;
    double deaths;
    double assists;
    double kda;

    public Player(String name, String role, double kills, double deaths, double assists) {
        this.name = name;
        this.role = role;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }
    void calculateKDA() {
        kda = (kills + assists) / deaths;
    }
    void showPlayerStats() {
        System.out.printf("Name: %s\nRole: %s\nKills: %.1f\nDeaths: %.1f\nAssists: %.1f\nKDA: %.2f\n", name, role, kills, deaths, assists, kda);
    }
}

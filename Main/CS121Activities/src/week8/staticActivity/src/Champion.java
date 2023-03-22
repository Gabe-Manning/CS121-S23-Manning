public class Champion {

    private String name;
    private String role;
    private double winrate;
    private static int champnumber;

    public Champion(String name, String role, double winrate) {
        this.name = name;
        this.role = role;
        this.winrate = winrate;
        champnumber++;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getWinrate() {
        return winrate;
    }

    public static int getChampnumber() {
        return champnumber;
    }
}

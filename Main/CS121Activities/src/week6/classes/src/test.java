public class test {
    public static void main(String[] args) {
        Player player1 = new Player("Caps","Mid", 10, 1, 5);
        Quarterback qb1 = new Quarterback("Aaron Rodgers", 100, 70);

        player1.calculateKDA();
        player1.showPlayerStats();
        System.out.println();

        qb1.calculateCompPer();
        qb1.showQBStats();
    }
}

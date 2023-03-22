public class ChampionMain {
    public static void main(String[] args) {
        Champion Ahri = new Champion("Ahri", "Mid", 52.05);
        Champion Jinx = new Champion("Jinx", "ADC", 47.98);
        System.out.printf("Ahri count: %d\n", Ahri.getChampnumber());
        System.out.printf("Jinx count: %d\n", Jinx.getChampnumber());
        System.out.printf("Champion count: %d\n", Champion.getChampnumber());
    }
}

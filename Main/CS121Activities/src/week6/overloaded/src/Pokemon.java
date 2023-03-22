public class Pokemon {
    private String name;
    private double attack;
    private double attackmod;
    private int speed;

    public Pokemon() {

    }
    public Pokemon(String name) {
        this.name = name;
    }
    public Pokemon(String name, double attack, double attackmod, int speed) {
        this.name = name;
        this.attack = attack;
        this.attackmod = attackmod;
        this.speed = speed;
    }
    public double getAttack() {
        return attack;
    }
    public void setAttack(double newattack) {
        attack = newattack;
    }
    public void setAttack(double newattack, double attackmod) {
        attack = newattack * attackmod;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newspeed) {
        speed = newspeed;
    }
    public double getAttackmod() {
        return attackmod;
    }
    public void setAttackmod(double newattackmod) {
        attackmod = newattackmod;
    }
    public String getName() {
        return name;
    }
    public void setName(String newname) {
        name = newname;
    }


}

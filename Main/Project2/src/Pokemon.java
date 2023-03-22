//Gabe Manning
//3/21/23
public class Pokemon {

    //Necessary variables
    private String name;
    private int hp;
    private String move;
    private int power;
    private int speed;

    //Pokemon constructor
    public Pokemon(String name, int hp, String move, int power, int speed) {
        this.name = name;
        this.hp = hp;
        this.move = move;
        this.power = power;
        this.speed = speed;
    }
    //Setters and getters
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getHp() {return hp;}

    public void setHp(int hp) {this.hp = hp;}

    public String getMove() {return move;}

    public void setMove(String move) {this.move = move;}

    public int getPower() {return power;}

    public void setPower(int power) {this.power = power;}

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {this.speed = speed;}

    //Returns a formatted string of Pokemon stats
    public String displayPokemonStats() {
        return String.format("Name: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d\n",
                name, hp, move, power, speed);
    }
}

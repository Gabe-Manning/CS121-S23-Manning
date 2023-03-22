package inheritance;

public class Mammal extends Animal {

    private boolean livebirth;

    public Mammal(String name, String color, int population, boolean livebirth) {
        super(name, color, population);
        this.livebirth = livebirth;
    }

    public boolean getLivebirth() {
        return livebirth;
    }

    public void setLivebirth(boolean livebirth) {
        this.livebirth = livebirth;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nColor: %s\nPopulation: %d\nLive Birth: %b\n", getName(), getColor(), getPopulation(), getLivebirth());
    }
}

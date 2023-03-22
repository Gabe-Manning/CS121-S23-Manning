package inheritance;

public class Reptile extends Animal {

    private boolean coldblooded;

    public Reptile(String name, String color, int population, boolean coldblooded) {
        super(name, color, population);
        this.coldblooded = coldblooded;
    }

    public boolean getColdblooded() {
        return coldblooded;
    }

    public void setColdblooded(boolean coldblooded) {
        this.coldblooded = coldblooded;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nColor: %s\nPopulation: %d\nCold Blooded: %b\n", getName(), getColor(), getPopulation(), getColdblooded());
    }
}

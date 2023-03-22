package inheritance;

public class Animal {

    private String name;
    private String color;
    private int population;

    public Animal(String name, String color, int population) {
        this.name = name;
        this.color = color;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nColor: %s\nPopulation: %d\n", getName(), getColor(), getPopulation());
    }
}

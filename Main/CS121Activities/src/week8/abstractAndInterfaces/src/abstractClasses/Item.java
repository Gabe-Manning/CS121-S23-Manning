package abstractClasses;

public class Item extends Pokemon {

    private boolean item;

    public Item(String name, String type, boolean item) {
        super(name, type);
        this.item = item;
    }

    public boolean getStone() {
        return item;
    }

    public void setStone(boolean item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nType: %s\nItem Evolution: %b\n");
    }

    public boolean checkEvolve() {
        if (item == true)
            return true;
        else
            return false;

    }
}

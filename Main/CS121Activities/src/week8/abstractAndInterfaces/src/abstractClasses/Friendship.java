package abstractClasses;

public class Friendship extends Pokemon {

    private int friendship;

    public Friendship(String name, String type, int friendship) {
        super(name, type);
        this.friendship = friendship;
    }

    public int getFriendship() {
        return friendship;
    }

    public void setFriendship(int friendship) {
        this.friendship = friendship;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nType: %s\nFriendship: %d\n");
    }

    public boolean checkEvolve() {
        if (friendship >= 200) {
            return true;
        }
        else
            return false;
    }

}

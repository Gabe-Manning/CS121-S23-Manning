import java.util.HashMap;
import java.util.Map;
public class Champions {
    private Map<String, String> champsMap = new HashMap<>();

    public void addChamp(String name, String role) {
        champsMap.put(name, role);
    }

    public void removeChamp(String name) {
        champsMap.remove(name);
    }

    public Object getRole(String name) {
        Object role;
        if (champsMap.containsKey(name)) {
            role = champsMap.get(name);
        } else {
            role = "Champion not found";
        }
        return role;
    }

    public void displayChamps() {
        champsMap.forEach((name, role) -> {
            System.out.printf("Champion Name: %s | Role: %s\n", name, role);
        });
    }
}
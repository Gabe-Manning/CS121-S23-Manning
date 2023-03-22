package packagesDemo;

public class Agent {

    //variables
    public String name;
    private String codename;
    public String agency;
    private String id;
    private String destination;

    public Agent(String name, String codename, String agency, String id, String destination) {
        this.name = name;
        this.codename = codename;
        this.agency = agency;
        this.id = id;
        this.destination = destination;
    }

    public void getAgentInfo() {
        System.out.printf("Name: %s\nAgency: %s\n", name, agency);
    }

    private void getAgentID() {
        System.out.printf("Name: %s\nID: %s\n", name, id);
    }

    protected void getAgentRecord() {
        System.out.printf("Name: %s\nCodename: %s\nAgency: %s\nID: %s\nDestination: %s\n", name, codename, agency, id, destination);

    }

    void getAgent() {
        System.out.printf("Name: %s\n", name);
    }
}

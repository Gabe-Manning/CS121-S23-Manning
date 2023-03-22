package packagesDemo;

public class AgentTest {
    public static void main(String[] args) {
        Agent agent1 = new Agent("Viktor Cross", "Bullet", "CIA", "13245", "Buenos Aires");

        System.out.printf("Name: %s\n", agent1.name);
        //System.out.printf("Codename: %s\n", agent1.codename);
        System.out.printf("Agency: %s\n", agent1.agency);
        //System.out.printf("ID: %s\n", agent1.id);
        //System.out.printf("Destination: %s\n", agent1.destination);
        System.out.println();

        agent1.getAgentInfo();
        System.out.println();
        //agent1.getAgentID();
        agent1.getAgent();
        System.out.println();
        agent1.getAgentRecord();
    }
}

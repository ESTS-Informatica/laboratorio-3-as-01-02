public class AirTransportation extends Transport{

    String name;
    int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName() {
        return name;
    }
}

public class AirTransportation extends Transport{

    String name;
    int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
}

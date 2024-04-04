public class AirTransportation extends Transport{

    public static final FEES = 0.04;
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

    public double getPrice() {
        return this.price;
    }

    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }
}

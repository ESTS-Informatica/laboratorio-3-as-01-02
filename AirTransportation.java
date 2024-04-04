public class AirTransportation extends Transport{

    public static final double FEES = 0.04;
    private String name;
    private int numberOfContainers;

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

    public String getTransportType(){
        return "Transporte aéreo";
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n","Nome:", this.name));
        sb.append(String.format("\n%15s: %s\n","Número de contentores:", this.numberOfContainers));

        return sb.toString();
    }
}

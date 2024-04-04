public class GroundTransportation extends Transport{

    public final static FEES = 0.03;
    String licensePlate;

    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }


    public double getPrice(){
        return this.price;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public double getPriceWithFees()
    {
        return this.price * FEES;
    }
}


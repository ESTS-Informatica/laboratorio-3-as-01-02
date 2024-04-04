public class GroundTransportation extends Transport{

    String licensePlate;

    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    //
}


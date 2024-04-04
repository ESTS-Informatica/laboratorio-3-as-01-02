public class GroundTransportation extends Transport{

    public final static double FEES = 0.03;
    private String licensePlate;

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

    public String getTransportType(){
        return "Transporte terrestre";
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n","Matrícula:", this.licensePlate));

        return sb.toString();
    }
}


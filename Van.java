public class Van extends GroundTransportation{

    private int packages;

    public Van(int packages, String licensePlate){
        this.packages = packages;
        this.licensePlate = licensePlate;
    }

    public int getPackages(){
        return packages;
    }

    public void setPackages(int packages){
        this.packages = packages;
    }
}

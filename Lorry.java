public class Lorry extends GroundTransportation {

    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfPallets, int trailers, String licensePlate){
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }

    public int getNumberOfPallets(){
        return numberOfPallets;
    }

    public int getTrailers(){
        return trailers;
    }

    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }

    public void setTrailers(int trailers){
        this.trailers = trailers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Numero de Paletes:", getNumberOfPallets()));
        sb.append(String.format("\n%15s: %s\n", "Numero de Trailers:", getTrailers()));
        sb.append(String.format("\n%15s: %s\n", "Matricula:", getLicensePlate()));
        return sb.toString();
    }
}

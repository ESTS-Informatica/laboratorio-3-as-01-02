public class Main {

    public static void main(String[] args){
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");

        company.add(new GroundTransportation("42AB32"));
        company.add(new AirTransportation("teste", 43));
        company.add(new AirTransportation("teste2", 20));
        company.add(new Lorry(15, 5, "54QE21"));
        company.add(new Van(67, "17NA90"));
    }
}

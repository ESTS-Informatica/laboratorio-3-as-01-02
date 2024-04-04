import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ShippingCompany extends HashSet<Transport> {

    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name){
        this.name = name;
    }

    public String getName(){return this.name;}

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<inService.size(); i++){
            sb.append(String.format("\n%15s: %s\n",inService.get(i).toString()));
        }

        return sb.toString();
    }

    public void makeTransportation(String id, String origin, String destination, double price){
        for (int i = 0; i<inService.size(); i++){
            if (id.equals(inService.get(i).getId())){
                if (inService.get(i).isAvailable()) {
                    inService.get(i).setAvailable(false);
                    inService.get(i).setOrigin(origin);
                    inService.get(i).setDestination(destination);
                    inService.get(i).setPrice(price);
                }
            }
        }
    }
}

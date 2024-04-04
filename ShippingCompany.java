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
        Transport t = getTransportation(id);
                if (t.isAvailable()) {
                    t.setAvailable(false);
                    t.setOrigin(origin);
                    t.setDestination(destination);
                    t.setPrice(price);
                }

                this.remove(t);
                inService.add(t);
    }

    private Transport getTransportation(String id){
        for(Transport t : this){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }

    public void finalizeTransportation(String id){
        Transport aux = new Transport();

        for (int i = 0; i<inService.size(); i++){
            if (id.equals(inService.get(i).getId())){
                aux = inService.get(i);
                inService.remove(i);
            }
        }

            aux.setDestination("");
            aux.setOrigin("");
            aux.setPrice(0.0);
            aux.setAvailable(true);
            this.add(aux);
    }
}
//
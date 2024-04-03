import java.util.HashSet;
import java.util.ArrayList;

public class ShippingCompany
{
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name)
    {
        this.name = name;
        this.inService = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public ArrayList<Transport> getInService()
    {
        return inService;
    }
    
    public void setInService(ArrayList<Transport> inService)
    {
        this.inService = inService;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Companhia Aérea: ").append(name).append("\n");
        sb.append("Transporte em Serviço:\n");
        for (Transport transport: inService)
        {
            sb.append(transport.toString()).append("\n");
        }
        return sb.toString();
    }
    
    private void addmethod()
    {
        GroundTransportation groundTransportation = new GroundTransportation(150.0, "MCD456");
        AirTransportation airTransportation1 = new AirTransportation(700.0, "Boeing 747", 2);
        AirTransportation airTransportation2 = new AirTransportation(900.0, "Airbus A380", 3);
        Lorry lorry = new Lorry(200.0, "XYZ456", 11, 4);
        Van van = new Van(150.0, "RTF092", 130);

        shippingCompany.add(groundTransportation);
        shippingCompany.add(airTransportation1);
        shippingCompany.add(airTransportation2);
        shippingCompany.add(lorry);
        shippingCompany.add(van);
    }
       
    public void show()
    {
        System.out.println("Transportes na empresa " + shippingCompany.getName() + ":");
        for (Transport transport : shippingCompany) 
        {
            System.out.println(transport);
        }
    }
    
    public void addToService(Transport transport)
    {
        inService.add(transport);
    }
    
    public void removeFromService(Transport transport)
    {
        inService.remove(transport);
    }
    
    public void makeTransportation(String id, String origin, String destination, double price)
    {
        Transport transport = getTransportation(id);
        if (transport != null && transport.isAvailable())
        {
            transport.setOrigin(origin);
            transport.setDestination(destination);
            transport.setPrice(price);
            transport.setAvailable(false);
            addToService(transport);
            remove(transport);
        }
    }
}

    

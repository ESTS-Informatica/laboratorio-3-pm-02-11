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

    public static void main(String[] args)
    {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");
    }

    
    
}
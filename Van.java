public class Van
{
    private GroundTransportation groundTransport;
    private int packages;

    public Van(int packages, GroundTransportation licensePlate)
    {
        this.packages = packages;
        this.licensePlate = new licensePlate();
    }
    
    public int getPackages()
    {
        return packages;
    }
    
    public void setPackages(int packages)
    {
        this.packages = packages;
    }

    
        
}
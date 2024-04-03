public class Lorry
{
    private GroundTransportation groundTransport;
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, GroundTransportation licensePlate)
    {
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
        this.licensePlate = "";
    }

    public int getNumberOfPallets()
    {
        return numberOfPallets;
    }
    
    public void setNumberOfPallets(int numberOfPallets)
    {
        this.numberOfPallets = numberOfPallets;
    }

    public int getTrailers()
    {
        return trailers;
    }
    
    public void setTrailers(int trailers)
    {
        this.trailers = trailers;
    }




    @Override
    public String toString()
    {
        return super.toString() + ", Número de Paletes: " + numberOfPallets + ", Número de Atrelados: " + trailers;
    }



}
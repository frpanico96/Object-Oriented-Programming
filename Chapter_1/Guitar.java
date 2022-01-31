package Chapter_1;

public class Guitar
{
    /* Member field */
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    /* Constructor */
    public Guitar(String serialNumber, double price, GuitarSpec spec)
    {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    /* Methods */
    public String getSerialNumber()
    {
        return serialNumber;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public GuitarSpec getSpec()
    {
        return this.spec;
    }
    
}
package Chapter_1;

import java.util.LinkedList;
import java.util.List;

public class Inventory
{
    /* Member variables */
    private List<Guitar> guitars;

    /* Constructor */
    public Inventory()
    {
        guitars = new LinkedList<Guitar>();
    }

    /* Methods */
    public void addGuitar(String serialNumber, double price,
        Builder builder, String model, Type type,
        Wood backWood, Wood topWood)
    {
        Guitar guitar = new Guitar(serialNumber,price,new GuitarSpec(builder, model,type,backWood,topWood));
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber)
    {
        for(Guitar guitar : guitars)
        {
            if(guitar.getSerialNumber().equals(serialNumber))
            {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar)
    {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for(Guitar guitar : guitars)
        {
            if(searchGuitar.getBuilder() != guitar.getSpec().getBuilder())
            {
                continue;
            }
            String model = searchGuitar.getModel().toLowerCase();
            if(model != null && !model.equals("") && !model.equals(guitar.getSpec().getModel().toLowerCase()))
            {
                continue;
            }
            if(searchGuitar.getType() != guitar.getSpec().getType())
            {
                continue;
            }
            if(searchGuitar.getBackWood() != guitar.getSpec().getBackWood())
            {
                continue;
            }
            if(searchGuitar.getTopWood() != guitar.getSpec().getTopWood())
            {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
    
}
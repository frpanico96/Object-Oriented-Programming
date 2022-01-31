package Chapter_1;

import java.util.List;

public class FindGuitarTest
{
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD);
        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if(!matchingGuitars.isEmpty())
        {
            System.out.println("Erin, you might like these guitars:\n ----");
            for(Guitar guitar : matchingGuitars)
            {
                System.out.println("  We have a " + 
                guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                guitar.getSpec().getType() + " guitar:\n   " +
                guitar.getSpec().getBackWood() + " back and sides,\n   "+
                guitar.getSpec().getTopWood() + " top.\n  You can have it for only $"+
                guitar.getPrice() + "!\n ----"
                );
            }
        }
        else
        {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory)
    {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
    }
}
package Inheritance;

public class Jet extends Airplane {
    /* Member Variables */
    private static final int MULTIPLIER = 2;
    
    /* Constructor - Inherited from superclass */
    public Jet()
    {
        super();
    }

    public void setSpeed(int speed)
    {
        super.setSpeed(speed * MULTIPLIER);
    }

    public void accelerate()
    {
        super.setSpeed(getSpeed() * 2);
    }


}

package Chapter_2;

public class DogDoor {
    
    /* Member variables */
    private Boolean open;

    /* Constructor */
    public DogDoor()
    {
        this.open = false;
    }

    /* Member methods */
    public void open()
    {
        System.out.println("The dog door is open");
        this.open = true;
    }
    public void close()
    {
        System.out.println("The dog door is closed");
        this.open = false;
    }
    public Boolean isOpen()
    {
        return this.open;
    }

}

package Chapter_2;

public class Remote {
    /* Member variables */
    private DogDoor door;

    /* Constructor */
    public Remote(DogDoor door)
    {
        this.door = door;
    }

    /* Member methods */
    public void pressButton()
    {
        System.out.println("Pressing the remote control button...");
        if(door.isOpen())
        {
            door.close();
        }
        else
        {
            door.open();
        }
    }
    
}

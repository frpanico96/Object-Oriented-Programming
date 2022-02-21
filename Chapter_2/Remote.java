package Chapter_2;

/* Java timing classes */
import java.util.Timer;
import java.util.TimerTask;

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
        /* Create a timer task to handle
         * Automatic closure of the door
        */
        final Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            public void run()
            {
                door.close();
                timer.cancel();
            }
        }, 5000);
    }
    
}

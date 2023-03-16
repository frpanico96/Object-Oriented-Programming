package Chapter_2;

public class DogDoorSimulator {
    

    /* Test class */    
    public static void main(String[] args)
    {
        DogDoor testDoor = new DogDoor();
        Remote testRemote = new Remote(testDoor);

        System.out.println("Fido scratches at the door");
        System.out.println("Fido barks to go outside...");
        testRemote.pressButton();
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");
        try
        {
            Thread.currentThread();
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {}
        System.out.println("Fido starts barking...");
        System.out.println("...but he's stuck outside");
        System.out.println("Fido scratches at the door.");
        System.out.println("so Gina grabs the remote control");
        testRemote.pressButton();
        System.out.println("\nFido's back inside...");
    }


}

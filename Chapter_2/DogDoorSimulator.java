package Chapter_2;

public class DogDoorSimulator {
    

    /* Test class */    
    public static void main(String[] args)
    {
        DogDoor testDoor = new DogDoor();
        Remote testRemote = new Remote(testDoor);
        System.out.println("Fido barks to go outside...");
        testRemote.pressButton();
        System.out.println("\nFido has gone outside...");
        testRemote.pressButton();
        System.out.println("\nFido's all done...");
        testRemote.pressButton();
        System.out.println("\nFido's back inside...");
        testRemote.pressButton();
    }


}

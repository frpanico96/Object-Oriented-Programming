package Inheritance;

public class FlyTest3 {
    
    public static void main(String[] args)
    {
        Airplane jet1 = new Jet();
        jet1.speed = 212;
        System.out.println(jet1.speed);

        Airplane jet2 = new Jet();
        jet2.setSpeed(212);
        System.out.println(jet2.getSpeed());
    }

}

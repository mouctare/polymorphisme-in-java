import jachampagne.Flyable;
import jachampagne.Vehicule;

public class Velo extends Vehicule implements Flyable {

    @Override
    public void moveXY(int x, int y) {
        
        System.out.println("je vaius super vite !!");
    }

    @Override
    public void fly() {
        System.out.println("pedallllllllllllllllll");


    }

}
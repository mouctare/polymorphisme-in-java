package jachampagne;


public class Moto   extends Vehicule implements Flyable 
{  public Moto()

{



this.mMovementSpeed = 250;

}
public void moveXY(int x, int y)

{

System.out.println("je vaius super vite !!");
}

// public void fly();



@Override
public void fly() {
    System.out.println("Plein gaz , la moto decolle et s'en va dans les nuages");

}
}
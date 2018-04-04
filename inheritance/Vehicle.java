
/**
 * Write a description of class Inheritance here.
 *
 * @author (Dylan)
 * @version (2.1.18)
 */
public abstract class Vehicle implements basicCar
{
    int seats;
    double speed;

    String name;
    public Vehicle(int seats, double speed, String name){
     this.seats = seats;
     this.speed = speed;
     this.name = name;

    }
    public void moveForward(){
     System.out.println("You move forward");
     
    }
}

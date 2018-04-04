
/**
 * Write a description of class keylessCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keylessCar extends Car
{
    public keylessCar(int seats, double speed, String name, int wheels, int cylinders, int doors){
        super(seats, speed, name, wheels, cylinders, doors);
    }
    public void turnOn(){
        if(engineOn){
            System.out.println("nothing happens");
        }else{
            engineOn= true;
            System.out.println("you press the button and the engine turns on");
        }
    }
    public void turnOff(){
        if(engineOn){
            System.out.println("you press the button and the engine turns off");
            engineOn = false;
        }else{
            System.out.println("nothing happens");
        }
    }
}

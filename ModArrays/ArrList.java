
/**
 * Write a description of class ArrList here.
 *
 * @author Dylan
 * @version 1.18.18
 */
import java.util.ArrayList;
import java.util.List;//this is actually an interface and not a class
import java.util.Scanner;
import java.lang.Integer;
public class ArrList
{
    ArrayList<Object> list;
    public ArrList(){
        list = new ArrayList<Object>();
        list.add("Hot pockets");
        list.add("Cookies");
        list.add("ramen");
        list.add("acid");
        list.add(new Scanner(System.in));
        list.add(new Integer(2));
        System.out.println(list.size());
    }
    
 /**   public void printList(){
        System.out.println("Your list contains:");
        System.out.println();
        for(Object i; list;){
            System.out.println(i);
        }
    }
    */
}

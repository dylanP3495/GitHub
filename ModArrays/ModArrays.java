
/**
 * Write a description of class ModArrays here.
 *
 * @author Dylan
 * @version 1.18.18
 */
public class ModArrays
{
    int[] array = {1, 2, 3, 4, 5, 6};

    public int changeNum(int num, int index){
        /**
         * If i call this method, it should change the array
         * @param num The new number to be added
         * @param index where the new number is to be placed
         */
        num = 9;
        array[4] = num;
        return array[index];
    }

    public void remove(int index){
        for (int i = index; i < array.length - 1; i++ ){
                array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;    
    }

    public void addnum(int num, int index){
            for(int i = array.length - 1; i > index; i--){
                array[i] = array[i - 1];
            }
            array[index] = num;
    }
}

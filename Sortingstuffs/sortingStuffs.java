
/**
 * Write a description of class sortingStuffs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sortingStuffs
{
    int[] array;
    int x = array.length;
    public sortingStuffs(){
        array = new int[7];
        array[0] = 5;
        array[1] = 4;
        array[2] = 8;
        array[3] = 17;
        array[4] = 9;
        array[5] = 11;
        array[6] = 0;
    }

    public void gucciGangBubble(){
        for (int i = 0; i < x; i++){
            for(int j = 0; j < x - 1; j++){
                if (array[j] > array [j+1]){
                    int holder = array[j];
                    array[j] = array[j+1];
                    array[j+1] = holder;
                }
            }
        }
    }

    public void gucciGangInsert(){
        for(int i = 0; i < x; i++){
            int comparison = array[i];
            int j = i-1;
            while((j > 1) && (array[j]>= comparison)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = comparison;
        }
    }

    public void gucciGangSelect(){
        for(int i = 0; i < x-1; i++){
            int min = i;
            for (int j = i + 1; j< x; j++){
                if (array[min] > array[j]){
                    min = j;
                }
            }
            int compare = array[i];
            array[i] = array[min];
            array[min] = compare;
        }
    }
}


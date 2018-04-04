
/**
 * Write a description of class WordList here.
 *
 * @author Dylan
 * @version 1.22.18
 */
import java.util.ArrayList;
import java.util.List;//this is actually an interface and not a class, apparently...
import java.util.Scanner;
import java.lang.Integer;
public class WordList
{
    private ArrayList <String> myList;

    public WordList(){
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
        myList.add("armadillo");
        myList.add("touro");
        myList.add("supercalafragalisticexpialadocious");
    }

    
    public int numWordsOfLength(int len){
        int wordsFound = 0;
        for(int i = 0; i< myList.size(); len++){
            String value = myList.get(i);
            if(value.length() == len){
                wordsFound ++;
            }
        }
        return wordsFound;
    }

    
    public void removeWordsOfLength(int len){
        for(int i = myList.size(); i >= 0; i--){
            String value = myList.get(i);
            if(value.length()== len){
                myList.remove(i);
            }
        }
    }
}
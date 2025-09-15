package Pertemuan11;

import java.util.ArrayList;

public class IterationTest {

    public static void main (String[] args) {
    // TODO Auto-generated method stub
        ArrayList<String> arr = new ArrayList<String>();
        arr.add ("Object");
        arr.add ("Programming") ;
        arr.add (1, "Oriented");

        // Using the Get method and the for loop
        for (int i = 0; i < arr.size (); i++) {
        System. out.print (arr.get (i) + " ");

        System. out.println ();

        // Using the for each loop
        for (String str : arr)
        System.out.println (str + " ");
        }
    }
}
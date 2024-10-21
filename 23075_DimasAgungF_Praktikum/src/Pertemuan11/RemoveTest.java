package Pertemuan11;

import java.util.ArrayList;

public class RemoveTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add(null);
        arr.add("emily");
        System.out.println(arr);
        
        arr.remove("Bob");
        System.out.println(arr);
        
        arr.remove("1");
        System.out.println(arr);
    }
}

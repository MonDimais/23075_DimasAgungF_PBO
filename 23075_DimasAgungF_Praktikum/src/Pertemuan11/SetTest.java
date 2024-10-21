package Pertemuan11;

import java.util.ArrayList;

public class SetTest {
    public static void main(String[] args) {
        // Membuat ArrayList dengan kapasitas default 10
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("20"); // Menambahkan elemen bertipe Integer
        arr.add("Cindy");
        arr.add(null); // Menambahkan nilai null
        System.out.println(arr);
        
        arr.set(4, "Deasy");
        System.out.println(arr);
    }
}
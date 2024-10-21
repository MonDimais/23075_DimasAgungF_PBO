package Pertemuan11;

import java.util.ArrayList;

public class AddTest {
    public static void main(String[] args) {
        // Membuat ArrayList dengan kapasitas default 10
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("20"); // Menambahkan elemen bertipe Integer
        arr.add("Cindy");
        arr.add(null); // Menambahkan nilai null
        System.out.println(arr);

        // Membuat ArrayList kedua
        ArrayList arr1 = new ArrayList();
        arr1.add("Emily");
        arr1.add("Bob");
        arr1.add("Cindy");
        System.out.println(arr1);

        // Menggabungkan kedua ArrayList menggunakan addAll()
        arr.addAll(arr1);
        System.out.println(arr);

        // Menambahkan semua elemen arr1 ke arr mulai dari indeks 2
        arr.addAll(2, arr1);
        System.out.println(arr);
    }
}

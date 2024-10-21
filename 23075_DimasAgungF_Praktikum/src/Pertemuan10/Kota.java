package Pertemuan10;
import java.util.Scanner;

public class Kota {
    public static void main(String[] args) {
        String[] kota = new String[20];
        Scanner input = new Scanner(System.in);
        int i;
        
        System.out.print("Masukkan Jumlah Data: ");
        int jumlah = input.nextInt();
        for (i = 0; i < jumlah; i++) {
            System.out.println("\nData ke " + (i + 1));
            System.out.print("Masukkan nama Kota: ");
            kota[i] = input.next();
        }
        
        System.out.println("\nNama - nama kota: ");
        for(i = 0; i < jumlah; i++) {
            System.out.print((i + 1) + ". ");
            System.out.println("Nama Kota : " + kota[i]);
        }
    }
}
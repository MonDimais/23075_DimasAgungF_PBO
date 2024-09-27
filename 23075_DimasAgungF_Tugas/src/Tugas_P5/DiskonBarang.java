package Tugas_P5;
import java.util.Scanner;

public class DiskonBarang {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double Pembelian, Potongan = 0, SetelahDiskon;
        
        System.out.print("Harga Barang: ");
        Pembelian = input.nextDouble();
        
        if(Pembelian < 50000) {
            Potongan = Pembelian * 0.05;
        } else if(Pembelian >= 50000) {
            Potongan = Pembelian * 0.20;
        }
        SetelahDiskon = Pembelian - Potongan;
        
        System.out.println("\nTotal Pembelian          : " + Pembelian);
        System.out.println("Besarnya Potongan        : " + Potongan);
        System.out.println("Harga Yang Harus Dibayar : " + SetelahDiskon);
    }
}

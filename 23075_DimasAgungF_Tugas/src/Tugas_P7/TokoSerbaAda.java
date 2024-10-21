package Tugas_P7;

import java.util.Scanner;

public class TokoSerbaAda {
    
    public static Barang cariBarang(String kode, Barang[] daftarBarang) {
        for(Barang barang : daftarBarang) {
            if(barang.kode.equals(kode)) {
                return barang;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Barang[] daftarBarang = {new Barang("a001", "Buku", 3000),
                                 new Barang("a002", "Pensil", 4000),
                                 new Barang("a003", "Pulpen", 5000)
        };
        
        System.out.println("\t\tToko Serba Ada");
        System.out.println("==============================================");
        System.out.print("Masukkan Angka Jumlah Barang yang Ingin dibeli: ");
        int jumlahBarang = input.nextInt();
        
        String[] inputanKode = new String[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];
        
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            inputanKode[i] = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
        }
        
        System.out.println("=======================================================================");
        System.out.printf("%-3s %-14s %-15s %-8s %-13s %-14s\n", 
                          "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("=======================================================================");
        
        int totalBayar = 0;
        
        for(int i = 0; i < jumlahBarang; i++) {
            Barang barang = cariBarang(inputanKode[i], daftarBarang);
            if(barang == null) {
                System.out.println("Kode Barang " + inputanKode[i] + " Tidak ditemukan");
                continue;
            }
            int jumlahBayar = barang.harga * jumlahBeli[i];
            totalBayar += jumlahBayar;
            
            System.out.printf("%-3d %-14s %-15s %-8d %-13d %-14d\n",
                             (i + 1), barang.kode, barang.nama, barang.harga, jumlahBeli[i], jumlahBayar);
        }
        System.out.println("======================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
    }
}

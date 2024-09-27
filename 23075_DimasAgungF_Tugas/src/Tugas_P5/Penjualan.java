package Tugas_P5;
import java.util.ArrayList;

public class Penjualan {
    private ArrayList<String> historiPenjualan = new ArrayList<>();
    private double totalPenjualan = 0.0;
    
    public Penjualan() {
        historiPenjualan = new ArrayList<>();
        totalPenjualan = 0;
    }
    
    public void recordPenjualan(ArrayList<Buku> buku, int ID, int jumlah) {
        for (Buku buku2 : buku) {
            if (buku2.ID == ID) {
                if (buku2.stok >= jumlah) {
                    buku2.stok -= jumlah;
                    double jumlahPenjualan = buku2.harga * jumlah;

                    totalPenjualan += jumlahPenjualan;
                    historiPenjualan.add("Buku " + buku2.judulBuku + " terjual sebanyak " + jumlah + " dengan harga Rp" + jumlahPenjualan);

                    System.out.println("Penjualan berhasil tercatat!");
                } else {
                    System.out.println("Stok buku " + buku2.judulBuku + " tidak cukup!");
                }
                return;
            }
        }

        System.out.println("Buku tidak ditemukan!");
    }
    
    public void tampilkanHistoriPenjualan() {
        if (historiPenjualan.isEmpty()) {
            System.out.println("Belum ada penjualan yang dicatat");
        } else {
            System.out.println("Histori Penjualan: ");
            for (String penjualan : historiPenjualan) {
                System.out.println(penjualan);
            }
        }
    }
    
    public void tampilkanTotalPenjualan() {
        System.out.println("Total penjualan yang didapat: Rp " + totalPenjualan);
    }
}

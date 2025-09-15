package Tugas_P5;
import java.util.ArrayList;

public class Buku {

    // Variable
    int ID, stok, tahunRilis;
    String judulBuku, penulis, penerbit;
    double harga;

    // Constructor
    public Buku(int ID, int stok, int tahunRilis, String judulBuku, String penulis, String penerbit, double harga) {
        this.ID = ID;
        this.stok = stok;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.harga = harga;
        this.tahunRilis = tahunRilis;
        this.penerbit = penerbit;
    }

    public static void listBuku(ArrayList<Buku> buku) {
        if (buku.isEmpty()) {
            System.out.println("Katalog buku masih kosong!");
        } else {
            System.out.println("Katalog Buku");
            System.out.println("===================================");
            for (Buku buku2 : buku) {
                System.out.println("ID : " + buku2.ID);
                System.out.println("Judul Buku : " + buku2.judulBuku);
                System.out.println("Penulis : " + buku2.penulis);
                System.out.println("Stok : " + buku2.stok);
                System.out.println("Harga : " + buku2.harga);
                System.out.println("===================================");
            }
        }
    }

    public static void detailBuku(ArrayList<Buku> buku, int id) {
        for (Buku buku2 : buku) {
            if (buku2.ID == id) {
                System.out.println("ID : " + buku2.ID);
                System.out.println("Judul Buku : " + buku2.judulBuku);
                System.out.println("Penulis : " + buku2.penulis);
                System.out.println("Tahun Terbit : " + buku2.tahunRilis);
                System.out.println("Penerbit : " + buku2.penerbit);
                System.out.println("Stok : " + buku2.stok);
                System.out.println("Harga : " + buku2.harga);
                return;
            }
        }

        System.out.println("Buku tidak dapat ditemukan!");
    }

}

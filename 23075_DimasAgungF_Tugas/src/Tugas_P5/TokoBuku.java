package Tugas_P5;

import java.util.ArrayList;
import java.util.Scanner;

public class TokoBuku {
    private static ArrayList<Buku> buku = new ArrayList<>();
    private static Penjualan penjualan = new Penjualan();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean program = true;

        while (program) {
            System.out.println("/======/ Toko Buku Berkah Jaya /======/");
            System.out.println("1. List Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Pembelian");
            System.out.println("5. History Penjualan");
            System.out.println("6. Total Penjualan");
            System.out.println("7. Exit");

            System.out.print("\nMasukan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> {
                    Buku.listBuku(buku);

                    System.out.println("Ingin melihat informasi buku yang lebih detail?");
                    System.out.print("Masukan ID buku yang ingin dilihat (Ketik 0 untuk kembali): ");
                    int id = input.nextInt();

                    if (id != 0) {
                        Buku.detailBuku(buku, id);
                    }
                }

                case 2 -> {
                    System.out.print("Masukkan ID Buku: ");
                    int idBuku = input.nextInt();
                    input.nextLine();

                    System.out.print("Masukan Nama Buku: ");
                    String nama = input.nextLine();

                    System.out.print("Masukan Penulis Buku: ");
                    String penulisBuku = input.nextLine();

                    System.out.print("Masukan Tahun Terbit: ");
                    int tahunRilisBuku = input.nextInt();

                    System.out.print("Masukan Penerbit: ");
                    String penerbitBuku = input.nextLine();

                    System.out.print("Masukan Stok: ");
                    int stokBuku = input.nextInt();

                    System.out.print("Masukan Harga: ");
                    double hargaBuku = input.nextDouble();

                    Buku bukuBaru = new Buku(idBuku, stokBuku, tahunRilisBuku, nama, penulisBuku, penerbitBuku, hargaBuku);
                    buku.add(bukuBaru);
                    System.out.println("Buku berhasil ditambahkan!");
                }

                case 3 -> {
                    System.out.print("Masukan ID Buku yang mau dihapus: ");
                    int id = input.nextInt();

                    buku.removeIf(buku2 -> buku2.ID == id);
                    System.out.println("Buku berhasil dihapus!");
                }

                case 4 -> {
                    System.out.print("Ingin membeli buku apa: ");
                    int id = input.nextInt();
                    System.out.print("Masukan jumlah: ");
                    int jumlah = input.nextInt();
                    penjualan.recordPenjualan(buku, id, jumlah);
                }

                case 5 -> {
                    penjualan.tampilkanHistoriPenjualan();
                }

                case 6 -> {
                    penjualan.tampilkanTotalPenjualan();
                }

                case 7 -> {
                    program = false;
                }
            
                default -> {
                    System.out.println("Pilihan tidak ditemukan!");
                }
            }
        }
    }
}

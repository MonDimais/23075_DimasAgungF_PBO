package Tugas_P6;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka yang ingin dibuat Tabel Perkaliannya (maksimal 10): ");
        int angka = scanner.nextInt();

        //Jika angka melewati batas 10 atau kurang dari 0, program tidak berjalan
        if (angka <= 10 && angka > 0) {
            System.out.println("\nTabel Perkalian " + angka + " x " + angka + ":");
            //Loop for didalam for
            for (int i = 1; i <= angka; i++) {
                //Ketika loop yang dibawah selesai maka akan diulang lagi dengan nilai baru i
                for (int j = 1; j <= angka; j++) {
                    System.out.print(i * j + "\t");
                }
                //Untuk menurunkan output agar tidak satu baris
                System.out.print("\n");
            }
        } else {
            System.out.println("Nilai n harus lebih kecil atau sama dengan 10 dan lebih besar dari 0.");
        }
        
    }
}

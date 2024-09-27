package Tugas_P5;
import java.util.Scanner;

public class PenilaianMahasiswa {
    public static void main (String[] args) {
        String NPM, NamaMHS, Keterangan = "-";
        char Grade = '-';
        double NilaiKehadiran, NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;
        Scanner input = new Scanner(System.in);
        
        System.out.print("NPM             : ");
        NPM = input.nextLine();
        System.out.print("Nama            : ");
        NamaMHS = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        NilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas     : ");
        NilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS       : ");
        NilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS       : ");
        NilaiUAS = input.nextDouble();
        
        NilaiAkhir = (0.10 * NilaiKehadiran) + (0.20 * NilaiTugas) + (0.30 + NilaiUTS) + (0.40 * NilaiUAS);
        
        if(0 <= NilaiAkhir && 45 >= NilaiAkhir) {
            Grade = 'E';
            Keterangan = "KURANG SEKALI";
        } else if(46 <= NilaiAkhir && 55 >= NilaiAkhir) {
            Grade = 'D';
            Keterangan = "KURANG";
        } else if(56 <= NilaiAkhir && 65 >= NilaiAkhir) {
            Grade = 'C';
            Keterangan = "CUKUP";
        } else if(66 <= NilaiAkhir && 75 >= NilaiAkhir) {
            Grade = 'B';
            Keterangan = "BAIK";
        } else if(76 <= NilaiAkhir && 100 >= NilaiAkhir || NilaiAkhir > 100) {
            NilaiAkhir = 100;
            Grade = 'A';
            Keterangan = "ISTIMEWA";
        }
        
        System.out.println("========================================================================");
        System.out.println("NPM Mahasiswa   : " + NPM);
        System.out.println("Nama Mahasiswa  : " + NamaMHS);
        System.out.println("Nilai Akhir     : " + NilaiAkhir);
        System.out.println("Grade           : " + Grade);
        System.out.println("Keterangan      : " + Keterangan);
        
    }
}

package Tugas_P5;
import java.util.Scanner;

public class KalkulatorIMT {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double BeratBadan, TinggiBadan, NilaiIMT;
        String Kriteria = "-";
        
        System.out.print("Masukkan Berat Badan(KG): ");
        BeratBadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan(M): ");
        TinggiBadan = input.nextDouble();
        
        NilaiIMT = BeratBadan / (TinggiBadan * TinggiBadan);
        
        if(NilaiIMT <= 18.4) {
            Kriteria = "Berat Badan Kurang";
        } else if (NilaiIMT >= 18.5 && NilaiIMT <= 24.9) {
            Kriteria = "Berat Badan Ideal";
        } else if (NilaiIMT >= 25 && NilaiIMT <= 29.9) {
            Kriteria = "Berat Badan Lebih";
        } else if (NilaiIMT >= 30 && NilaiIMT <= 39.9) {
            Kriteria = "Gemuk";
        } else if (NilaiIMT >= 40) {
            Kriteria = "Sangat Gemuk";
        }
        
        System.out.println("Nilai IMT Anda: " + NilaiIMT);
        System.out.println("Masuk Kriteria: " + Kriteria);
        
    }
}

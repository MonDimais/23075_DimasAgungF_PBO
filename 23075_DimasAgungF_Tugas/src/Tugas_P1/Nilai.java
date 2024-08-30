package Tugas_P1;


public class Nilai {
    String Nama;
    int NIM;
    int N_Absen;
    int N_Tugas;
    int N_UTS;
    int N_UAS;
    int N_Akhir;
    
    void Nilai() {
        System.out.println("Nama       : " + this.Nama);
        System.out.println("NIM        : " + this.NIM);
        System.out.println("\nNilai Absen: " + this.N_Absen);
        System.out.println("Nilai Tugas: " + this.N_Tugas);
        System.out.println("Nilai UTS  : " + this.N_UTS);
        System.out.println("Nilai UAS  : " + this.N_UAS);
    }
    
    void CetakNilai() {
        System.out.println("\nNilai Akhir yang didapat oleh " + this.Nama + ": " + this.N_Akhir);
    }
}

package Tugas_P1;

public class DemoNilai {
    public static void main(String[] args) {
        Nilai DMS = new Nilai();
        
        DMS.Nama = "Dimas";
        DMS.NIM = 23075;
        DMS.N_Absen = 100;
        DMS.N_Tugas = 95;
        DMS.N_UTS = 90;
        DMS.N_UAS = 90;
        
        DMS.Nilai();
        
        DMS.N_Akhir = DMS.N_Absen + DMS.N_Tugas + DMS.N_UTS + DMS.N_UAS;
        DMS.N_Akhir /= 4;
        
        DMS.CetakNilai();
    }
}

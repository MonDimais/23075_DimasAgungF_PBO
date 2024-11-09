package Tugas_P8;

public class HitungHari {
    
    public int hitung(int tahun, String bulan) {
        switch (bulan) {
            case "Januari": case "Maret": case "Mei": case "Juli":
            case "Agustus": case "Oktober": case "Desember":
                return 31;
            case "April": case "Juni": case "September": case "November":
                return 30;
            case "Februari":
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    return 29; // Tahun kabisat
                } else {
                    return 28; // Tahun biasa
                }
            default:
                return 0;
        }
    }
}


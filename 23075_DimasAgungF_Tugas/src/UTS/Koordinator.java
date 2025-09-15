package UTS;

public class Koordinator extends Kegiatan implements PengelolaKegiatan, PelaksanaKegiatan{
    String namaKoordinator, email;
    
    public Koordinator(String namaKegiatan, String tanggal, String lokasi, String namaKoordinator, String email) {
        super(namaKegiatan, tanggal, lokasi);
        this.namaKoordinator = namaKoordinator;
        this.email = email;
    }
    
    @Override
    public void mengelolaKegiatan() {
        System.out.println("Mengatur Jadwal di Notion!");
    }
    
    @Override
    public void melaksanaKegiatan() {
        System.out.println("Just Do IT!");
    }
}

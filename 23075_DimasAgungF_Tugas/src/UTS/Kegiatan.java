package UTS;

public class Kegiatan {
    private String namaKegiatan, tanggal;
    String lokasi;
    
    public String getNamaKegiatan(){
        return namaKegiatan;
    }
    
    public String gettanggal() {
        return tanggal;
    }
    
    public Kegiatan(String namaKegiatan, String tanggal, String lokasi) {
        this.namaKegiatan = namaKegiatan;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
    }
    
    String[] listKegiatan = {"Makan", "Minum", "Tidur"};
    
    public void tampilkanKegiatan() {
        if(listKegiatan.length == 0) {
            System.out.println("Tidak ada Kegiatan Hari ini");
        } else {
          for (String Kegiatan : listKegiatan) {
          System.out.println("Kegiatan: " + Kegiatan);
          }
        }
        
    }
}

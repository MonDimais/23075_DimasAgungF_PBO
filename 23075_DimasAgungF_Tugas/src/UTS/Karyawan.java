package UTS;

public class Karyawan {
    private String Nama, IdKaryawan;
    int HariKerja;
    
    public String getNama(){
        return Nama;
    }
    
    public String getId() {
        return IdKaryawan;
    }
    
    public Karyawan(String Nama, String IdKaryawan) {
        this.Nama = Nama;
        this.IdKaryawan = IdKaryawan;
    }
    
}

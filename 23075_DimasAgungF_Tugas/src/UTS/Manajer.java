package UTS;

public class Manajer extends Karyawan implements Pengelola, Pekerja{
    String ProjekTim;
    
    public Manajer(String Nama, String IdKaryawan, String ProjekTim) {
        super(Nama, IdKaryawan);
        this.ProjekTim = ProjekTim;
    }
     
    @Override
    public void mengelolaKaryawan(String Nama, String IdKaryawan){
        System.out.println("Karyawan " + Nama);
        System.out.println("Dengan Id " + IdKaryawan);
    }
    
    @Override
    public void bekerja(String IdKaryawan, int HariKerja) {
        System.out.println("Karyawan dengan Id Nomor " + IdKaryawan);
        System.out.println("Bekerja Selama Sebulan " + HariKerja + " Hari");
    }
    
    public void HitungHari(int HariKerja){
        for (int i = 1; i <= HariKerja; i++) {
            System.out.println("Go To Work Day - " + i);
        }
    }
}

package UTS;

public class KegiatanKoordinatorMain {
    public static void main(String[] args) {
        Koordinator koordinator = new Koordinator("Harian", "22-10-2005", "Rumah", "Mondi", "mondaymake@mail.com");
        koordinator.mengelolaKegiatan();
        koordinator.melaksanaKegiatan();
        koordinator.tampilkanKegiatan();
    }
}

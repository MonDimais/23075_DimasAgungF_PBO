package UTS;

public class KaryawanManajerMain {
    public static void main (String[] args) {
        Manajer Mm1 = new Manajer("Kaasep", "501", "Dungeon Rune Projek");
        Mm1.mengelolaKaryawan("Kaamyaat", "101");
        Mm1.bekerja("101", 24);
        Mm1.HitungHari(24);
    }
}

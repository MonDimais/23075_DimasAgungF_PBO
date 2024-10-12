package Tugas_P6;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int anakAyam = 6;
        
        System.out.println("Lagu Anak Ayam Turun " + anakAyam + ":\n");

        for (int i = anakAyam; i > 0; i--) {
            //Jika anak ayam tinggal satu, maka akan jadi akhir lagu
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
            //Mengoutput jumlah anak ayam yang ada
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
    }
}


package Tugas_P6;

public class DeretBilanganGanjilGenap {
    public static void main(String[] args) {
        int batas = 20;
        
        System.out.println("Bilangan Ganjil dan Genap (0 - 20):\n");

        int i = 0;
        while (i <= batas) {
            //Jika i dibagi 2 = 0 atau habis, maka bilangan genap
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
            //Jika tidak maka bilangan ganjil
                System.out.println(i + " adalah bilangan ganjil.");
            }
            i++;
        }
    }
}


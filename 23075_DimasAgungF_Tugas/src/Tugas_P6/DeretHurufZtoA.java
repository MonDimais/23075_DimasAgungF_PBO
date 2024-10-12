package Tugas_P6;

public class DeretHurufZtoA {
    public static void main(String[] args) {
        char huruf = 'Z';
        
        System.out.println("Deret Huruf Z - A:\n");
        
        do {
            System.out.println(huruf);
            huruf--;
        } while (huruf >= 'A');
    }
}


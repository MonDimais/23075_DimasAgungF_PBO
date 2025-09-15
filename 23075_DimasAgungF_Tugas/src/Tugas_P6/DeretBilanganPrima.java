package Tugas_P6;

public class DeretBilanganPrima {
    public static void main(String[] args) {
        int batas = 20;
        
        System.out.println("Bilangan Prima dan Bukan Prima (0 - 20):\n");

        for (int i = 0; i <= batas; i++) {
            if (BilPrima(i)) {
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " adalah bukan bilangan prima.");
            }
        }
    }

    public static boolean BilPrima(int num) {
        //Bilangan yang dibawah 2 bukan bilangan prima
        if (num <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            //Jika num dibagi i = 0 atau habis, maka bukan prima
            if (num % i == 0) return false;
        }
        //Jika tidak ada pembagi dari 2 hingga sqrt(num), maka prima
        return true;
    }
}


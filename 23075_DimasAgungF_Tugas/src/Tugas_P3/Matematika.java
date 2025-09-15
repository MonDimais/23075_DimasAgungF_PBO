package Tugas_P3;

public class Matematika{
    int a, b, total;
    
    public void pertambahan(int a, int b) {
        this.a = a;
        this.b = b;
        total = a + b;
        System.out.println("Hasil Pertambahan dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
    
    public void pengurangan(int a, int b) {
        this.a = a;
        this.b = b;
        total = a - b;
        System.out.println("Hasil Pengurangan dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
    
    public void perkalian(int a, int b) {
        this.a = a;
        this.b = b;
        total = a * b;
        System.out.println("Hasil Perkalian dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
    
    public void pembagian(int a, int b) {
        this.a = a;
        this.b = b;
        total = a / b;
        System.out.println("Hasil Pembagian dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
}


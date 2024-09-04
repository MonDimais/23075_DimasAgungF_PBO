package Tugas_P2;

public class Matematika implements IF_Matematika{
    int a, b, total;
    
    @Override
    public void pertambahan(int a, int b) {
        this.a = a;
        this.b = b;
        total = a + b;
        System.out.println("Hasil Pertambahan dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
    
    @Override
    public void pengurangan(int a, int b) {
        this.a = a;
        this.b = b;
        total = a - b;
        System.out.println("Hasil Pengurangan dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
    
    @Override
    public void perkalian(int a, int b) {
        this.a = a;
        this.b = b;
        total = a * b;
        System.out.println("Hasil Perkalian dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
    
    @Override
    public void pembagian(int a, int b) {
        this.a = a;
        this.b = b;
        total = a / b;
        System.out.println("Hasil Pembagian dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
}

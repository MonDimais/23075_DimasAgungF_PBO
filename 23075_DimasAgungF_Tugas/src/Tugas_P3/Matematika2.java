package Tugas_P3;

public class Matematika2 extends Matematika{
    public void Modulus(int a, int b) {
        this.a = a;
        this.b = b;
        total = a%b;
        System.out.println("Hasil Modulus dari " + this.a + " dengan " + this.b + " adalah " + this.total);
    }
}

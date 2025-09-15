package Tugas_P4;

public class Balok extends Rumus3D{
    private double Panjang, Lebar, Tinggi;
    
    public Balok(double Panjang, double Lebar, double Tinggi) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Tinggi = Tinggi;
    }
    
    @Override
    public double Volume() {
        return Panjang * Lebar * Tinggi;
    }
    
    @Override
    public double Luas() {
        return 2 * (Panjang * Lebar + Panjang * Tinggi + Lebar * Tinggi);
    }
    
    //Overload
    public double Volume(double Panjang, double Lebar, double Tinggi) {
        return Panjang * Lebar * Tinggi;
    }
    
    //Overload
    public double Luas(double Panjang, double Lebar, double Tinggi) {
        return 2 * (Panjang * Lebar + Panjang * Tinggi + Lebar * Tinggi);
    }
}

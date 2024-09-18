package Tugas_P4;

public class Kubus extends Rumus3D{
    private double Sisi;
    
    public Kubus(double Sisi) {
        this.Sisi = Sisi;
    }
    
    @Override
    public double Volume() {
        return Math.pow(Sisi, 3);
    }
    
    @Override
    public double Luas() {
        return 6 * Math.pow(Sisi, 2);
    }
    
    //Overload
    public double Volume(double Sisi) {
        return Math.pow(Sisi, 3);
    }
    
    //Overload
    public double Luas(double Sisi) {
        return 6 * Math.pow(Sisi, 2);
    }
}

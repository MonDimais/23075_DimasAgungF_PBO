package Tugas_P4;

public class HitungMain {
    public static void main (String[] args) {
        Rumus3D Balok = new Balok(6, 5, 4);
        Rumus3D Kubus = new Kubus(4);
        
        System.out.println("Output Tanpa Metode Polimorfisme");
        System.out.println("Volume Balok    : " + Balok.Volume());
        System.out.println("Luas Balok      : " + Balok.Luas());
        
        System.out.println("Volume Kubus    : " + Kubus.Volume());
        System.out.println("Luas Kubus      : " + Kubus.Luas());
        
        Balok balokoverload = new Balok(0, 0, 0);
        Kubus kubusoverload = new Kubus(0);
        
        System.out.println("\nOutput Setelah Melakukan Overload");
        System.out.println("Volume Balok    : " + balokoverload.Volume(3, 2, 1));
        System.out.println("Luas Balok      : " + balokoverload.Luas(3, 2, 1));
        
        System.out.println("Volume Kubus    : " + kubusoverload.Volume(5));
        System.out.println("Luas Kubus      : " + kubusoverload.Luas(5));
    }
}

package Praktikum5;

public class PernyataanIF {
    public static void main (String[] args){
        int Diskon = 0, totalBelanja = 500000;

        if(totalBelanja >= 100000){
            Diskon = totalBelanja / 10;
        }
        System.out.println("Diskon = " + Diskon);
    }
    
}

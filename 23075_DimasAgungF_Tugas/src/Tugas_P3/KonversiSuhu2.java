package Tugas_P3;

public class KonversiSuhu2 extends KonversiSuhu{
    double fahrenheit;
    
    public void FahrenheittoCelcius(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        total = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println(fahrenheit + " Celcius di Konvert ke Fahrenheit = " + total);
    }
    
    public void FahrenheittoReamur(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        total = (4.0 / 9.0) * (fahrenheit - 32);
        System.out.println(fahrenheit + " Celcius di Konvert ke Fahrenheit = " + total);
    }
}

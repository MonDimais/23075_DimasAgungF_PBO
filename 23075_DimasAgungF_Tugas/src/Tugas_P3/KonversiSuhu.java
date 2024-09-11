package Tugas_P3;

public class KonversiSuhu {
    double celcius, total;
    
    public void CelciustoFahrenheit(double celcius) {
        this.celcius = celcius;
        total = (9.0 / 5.0) * celcius + 32;
        System.out.println(celcius + " Celcius di Konvert ke Fahrenheit = " + total);
    }
    
    public void CelciustoReamur(double celcius) {
        this.celcius = celcius;
            total = (4.0 / 5.0) * celcius;
        System.out.println(celcius + " Celcius di Konvert ke Reamur = " + total);
    }
}

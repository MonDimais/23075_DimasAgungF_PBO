package Praktikum5;
import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        int angka1 = masukan.nextInt();
        System.out.print("Masukkan angka 2: ");
        int angka2 = masukan.nextByte();

        System.out.println("Perkalian antara " + angka1 + " dan " + angka2 + " adalah " + angka1 * angka2);
    }
}

import model.Tabung;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nKaren Onggie_21SI1");
        System.out.println("-----------------------");

        System.out.println("Perhitungan Luas Tabung");
        Scanner keyboard = new Scanner(System.in);
        Tabung Tabung1 = new Tabung();

        System.out.println("Masukkan panjang jari-jari tabung (r) = ");
        Tabung1.r = keyboard.nextDouble();

        System.out.println("\nMasukkan tinggi tabung (T) = ");
        Tabung1.T = keyboard.nextDouble();

        System.out.println("\n-----------------------\n");

        Tabung1.LuasTabung();
    }
}

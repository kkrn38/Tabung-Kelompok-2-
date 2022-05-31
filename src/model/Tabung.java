package model;
public class Tabung {
    public double r = 14.0;
    public double T = 15.0;
    public final double PI = 22.0/7;
    public void LuasTabung()
    {
        System.out.println("Nilai dari jari-jari tabung (r) = " + r +" cm");
        System.out.println("Nilai dari tinggi tabung (T) = " + T +" cm");
        System.out.println("Nilai dari pi = " + PI);

        double LS = 2 * PI * r * T;
        double LP = LS + (2 * PI * Math.pow(r , 2));
        
        System.out.println("\nLuas Selimut Tabung = " + LS);
        System.out.println("Luas Permukaan Tabung = " + LP);
        
    }
}

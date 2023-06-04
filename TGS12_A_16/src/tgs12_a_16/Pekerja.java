/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tgs12_a_16;

/**
 *
 * @author Alfa
 */
public abstract class Pekerja {
    protected String nama;
    protected double gaji;
    protected Restoran restoran;
    
    public static StringBuffer space = new StringBuffer();

    public Pekerja(String nama, double gaji, Restoran restoran) {
        this.nama = nama;
        this.gaji = gaji;
        this.restoran = restoran;
        restoran.registerObserver(this);
    }
    
    
    
    public abstract void showData();
    
    public abstract void update(double Jumlah);
    
    public abstract double getGaji();
    
}

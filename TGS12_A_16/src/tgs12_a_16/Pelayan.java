/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tgs12_a_16;

/**
 *
 * @author Alfa
 */
public class Pelayan extends Pekerja{
    private int jumlahShift;

    public Pelayan(int jumlahShift, String nama, double gaji, Restoran restoran) {
        super(nama, gaji, restoran);
        this.jumlahShift = jumlahShift;
        
    }

    

    @Override
    public void showData() {
        System.out.println(" [Pelayan] "+nama + " - Total Gaji: " + gaji + " IDR");
    }

    @Override
    public void update(double Jumlah) {
        double bonusUtama = Jumlah;
        double pertambahan = (bonusUtama / 0.5) + (jumlahShift * 10000);
        System.out.println("\tGaji "+nama+" bertambah sebesar : " + pertambahan);
        gaji += pertambahan;
        
    }

    @Override
    public double getGaji() {
        return gaji;
    }

    


    
    
    
}

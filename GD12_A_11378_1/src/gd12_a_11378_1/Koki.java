/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gd12_a_11378_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfa
 */
public class Koki extends Pekerja {
    private String jenis;
    private List<Pekerja> pekerja;
    private int jumlahBawahan = 0;

    public Koki(String jenis, String nama, double gaji, Restoran restoran) {
        super(nama, gaji, restoran);
        this.jenis = jenis;
        this.pekerja = new ArrayList<>();
        
    }

    
    public void reckrutBawahan(Pekerja p){
        pekerja.add(p);
        jumlahBawahan = pekerja.size();
    }

    @Override
    public void showData() {
        System.out.println(" [Koki] " + nama);
        IComposite.space.append("    ");
        
        for (Pekerja pkj : pekerja) {
            System.out.print(IComposite.space + " [Bahawan " + nama + "] - Total Gaji: " + gaji + " IDR");
            pkj.showData();
        }
        
        IComposite.space.setLength(IComposite.space.length() -3);
    }

    @Override
    public void update(double jumlah) {
        double bonusUtama = jumlah;
        double pertambahan = 0;
        if ("Kepala".equals(jenis)) {
            pertambahan = bonusUtama + (jumlahBawahan * 100000);
        }else{
            pertambahan = bonusUtama + (jumlahBawahan * 80000);

        }
        
        System.out.println("\tGaji "+nama+" bertambah sebesar : " + pertambahan);
        gaji += pertambahan;
        
        
        
    }

    @Override
    public double getGaji() {
        double totalGaji = gaji;
        for (Pekerja pkj : pekerja) {
            totalGaji += pkj.getGaji();
        }
        
        return totalGaji;
    }

    public String getJenis() {
        return jenis;
    }
    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gd12_a_11378_1;

import java.util.ArrayList;

/**
 *
 * @author Alfa
 */
public class Restoran{
    private String namaRestoran, alamat;
    private Koki manager;
    private ArrayList<Pekerja> pekerja;
    private double danaRestoran;

    public Restoran(String namaRestoran, String alamat, double danaRestoran) {
        this.namaRestoran = namaRestoran;
        this.alamat = alamat;
        this.danaRestoran = danaRestoran;
        pekerja = new ArrayList<>();
    }
    
    public void tampilDataPekerja(){
        System.out.println(namaRestoran);
        System.out.println(alamat);
        System.out.println("Jumlah Dana Restoran :" + danaRestoran);
        
        manager.showData();
        
    }
    
    public void registerObserver(Pekerja P){
        pekerja.add(P);
        
    }
    
    public void notifyObserver(double jumlah){
        for (Pekerja p : pekerja) {
            p.update(jumlah);
        }
    }
    
    public void reservasi(double hargaReservasi, int lamaReservasi){
        danaRestoran += (hargaReservasi * lamaReservasi) + 250000;
        double bonus;
        bonus = (hargaReservasi * lamaReservasi) + 250000;
        
        notifyObserver(bonus);
    }
    
    public void setManager(Koki manager){
        if ("Kepala".equals(manager.getJenis())) {
            this.manager = manager;
        }else{
            System.out.println("Bukan Seorang Kepala Koki!");
            System.exit(0);
        }
        
    }
    
    public void showTotalGaji(){
        System.out.println("");
        System.out.println("Total Gaji : " + manager.getGaji() + " IDR");
    } 
    
    
    
}

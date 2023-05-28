/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gd12_a_11378_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfa
 */
public class Perusahaan{

    private String namaPerusahaan;
    private float bonus;
    private List<Observer> pegawai;

    public Perusahaan(String namaPerusahaan) {
        
        this.namaPerusahaan = namaPerusahaan;
        this.bonus = 0;
        this.pegawai = new ArrayList<>();
    }


    
    
    public void registerObserver(Observer obs){
        pegawai.add(obs);
    }
    
    public void removeObserver(Observer obs){
        pegawai.remove(obs);
    }
    
    public void TambahBonus(float bonus){
        this.bonus = bonus;
        notifyBonus();
        
    }
    
    public void notifyBonus(){
        for (Observer obs : pegawai) {
            obs.update(bonus);
        }
    }
   
}

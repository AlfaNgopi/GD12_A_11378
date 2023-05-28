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
public class Kepala implements IComposite {
    private String namaKepala;
    private List<IComposite> bawahan;

    public Kepala(String namaKepala) {
        this.namaKepala = namaKepala;
        this.bawahan = new ArrayList<>();
    }
    
    public void tambahBawahan(IComposite comp){
        bawahan.add(comp);
    }

    @Override
    public void showData() {
        System.out.println(IComposite.space + " Bapak Kepala " + namaKepala);
        IComposite.space.append("    ");
        
        for (IComposite comp : bawahan) {
            System.out.print(IComposite.space + " Bahawan Dari " + namaKepala + " ");
            comp.showData();
        }
        
        IComposite.space.setLength(IComposite.space.length() -3);
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gd12_a_11378_2;

/**
 *
 * @author Alfa
 */
public class Marketing extends Observer{

    private float komisiPenjualan;

    public Marketing(float komisiPenjualan, Perusahaan model, String namaPgw, float gaji) {
        super(model, namaPgw, gaji);
        this.komisiPenjualan = komisiPenjualan;
    }
    
    
    
    
    @Override
    public void update(float bonus) {
        
        float tempGaji = gaji;
        gaji += bonus + komisiPenjualan;
        System.out.println(namaPgw + " --Gaji Sebelum : " + tempGaji + " Gaji Sesudah " + gaji);
        
    }
}

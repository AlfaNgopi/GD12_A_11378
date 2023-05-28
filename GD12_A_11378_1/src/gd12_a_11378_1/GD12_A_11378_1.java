/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd12_a_11378_1;

/**
 *
 * @author ASUS
 */
public class GD12_A_11378_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kepala directur = new Kepala("DIRECTUR ALFA NADA YULASWARA");
        Kepala manager = new Kepala("MANAGER 210711378");
        
        Karyawan asisten = new Karyawan("Bobi", "Asisten Directur");
        Karyawan cs = new Karyawan("Mari", "Customer Service");
        Karyawan sekret = new Karyawan("Studi", "Sekretaris");
        
        directur.tambahBawahan(manager);
        directur.tambahBawahan(asisten);
        
        manager.tambahBawahan(cs);
        manager.tambahBawahan(sekret);
        
        directur.showData();
        
    }
    
}

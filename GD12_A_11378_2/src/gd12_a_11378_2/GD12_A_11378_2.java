/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gd12_a_11378_2;

/**
 *
 * @author ASUS
 */
public class GD12_A_11378_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perusahaan perus = new Perusahaan("Perusahaan DP1");
        
        Observer pg1 = new Marketing(40000, perus, "Market", 10000);
        Observer pg2 = new IT(3, perus, "IT", 30000);
        
        perus.TambahBonus(5000);
        
        perus.removeObserver(pg2);
        System.out.println("setelah Remove");
        
        perus.TambahBonus(2000);
    }
    
}

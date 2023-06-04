/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs12_a_16;

/**
 *
 * @author ASUS
 */
public class TGS12_A_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restoran restoran = new Restoran("Restoran Street Food Corner", "JL. Mentari Indah No.15A", 50000000);
        
//        Koki manager = new Koki("biada", "Suryanto", 12000000, restoran);
        Koki manager = new Koki("Kepala", "Suryanto", 12000000, restoran);
        restoran.setManager(manager);
        
        Koki agus = new Koki("Kepala", "Agus", 10000000, restoran);
        Koki nita = new Koki("Biasa", "Nita", 6000000, restoran);
        
        Pelayan rizky = new Pelayan(1,"Rizky", 2000000, restoran);
        Pelayan jakub = new Pelayan(2,"Jakub", 2700000, restoran);
        Pelayan nia = new Pelayan(5,"Nia", 4000000, restoran);
        Pelayan rina = new Pelayan(2,"Rina", 2500000, restoran);
        
        
        manager.reckrutBawahan(nita);
        manager.reckrutBawahan(agus);
        
        agus.reckrutBawahan(nia);
        agus.reckrutBawahan(rina);
        
        nita.reckrutBawahan(rizky);
        nita.reckrutBawahan(jakub);
        
        
        
        restoran.tampilDataPekerja();
        
        System.out.println("--------------------------------");
        
        restoran.reservasi(400000, 2);
        
        System.out.println("--------------------------------");
        
        restoran.tampilDataPekerja();
        
        restoran.showTotalGaji();
        
    }
    
}

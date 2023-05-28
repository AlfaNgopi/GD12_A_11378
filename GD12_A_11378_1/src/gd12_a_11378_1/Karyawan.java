/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gd12_a_11378_1;

/**
 *
 * @author Alfa
 */
public class Karyawan implements IComposite{
    private String namaKaryawan, jabatan;

    public Karyawan(String namaKaryawan, String jabatan) {
        this.namaKaryawan = namaKaryawan;
        this.jabatan = jabatan;
    }

    @Override
    public void showData() {
        System.out.println(namaKaryawan + " - " + jabatan);
    }

    
    
    
}

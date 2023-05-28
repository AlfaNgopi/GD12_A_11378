/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gd12_a_11378_2;

/**
 *
 * @author Alfa
 */
public abstract class Observer {
    protected Perusahaan model;
    protected String namaPgw;
    protected float gaji;

    public Observer(Perusahaan model, String namaPgw, float gaji) {
        this.model = model;
        this.namaPgw = namaPgw;
        this.gaji = gaji;
        this.model.registerObserver(this);
    }
    
    public abstract void update(float bonus);
        
    
}

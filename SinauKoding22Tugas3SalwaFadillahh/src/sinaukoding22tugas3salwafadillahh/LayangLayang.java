/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinaukoding22tugas3salwafadillahh;

/**
 *
 * @author salwa
 */
public class LayangLayang implements PerhitunganBangunDatar {
private float sisi1, sisi2, diagonal1, diagonal2;

    public void keliling(float sisi1, float sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        
        
    }

    public void luas(float diagonal1, float diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override
    
    public float keliling() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 2*(sisi1+sisi2);
    }

    @Override
    public float luas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (diagonal1 * diagonal2) / 2;
    }
    
}

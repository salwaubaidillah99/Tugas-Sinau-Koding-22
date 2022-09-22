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
class Persegi implements PerhitunganBangunDatar {
private float sisi;
    public Persegi(float sisi) {
        this.sisi = sisi;
    }
    @Override
    public float keliling() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return 4 * sisi;
    }

    @Override
    public float luas() {
    return sisi * sisi;
    }    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}

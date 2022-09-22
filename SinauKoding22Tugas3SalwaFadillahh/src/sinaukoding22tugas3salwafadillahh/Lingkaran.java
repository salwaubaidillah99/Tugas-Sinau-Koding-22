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
public class Lingkaran implements PerhitunganBangunDatar{
private float x;

    public Lingkaran(float x) {
        this.x = x;
    }
    
    @Override
    public float keliling() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return (float) (2 * Math.PI * x);
    }

    @Override
    public float luas() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return (float) (Math.PI * Math.pow(x, 2));
    }
    
}

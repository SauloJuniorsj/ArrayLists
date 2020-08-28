/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.objetos;

/**
 *
 * @author Saulo Jr
 */
public class Impar extends Numero{
    
    private int impar ;
    
    public Impar(int n) {
        super(n);
    }

    public int getImpar() {
        return impar;
    }
    
    @Override
    public String toString() {
        return "Sou classe Impar, nº " +super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

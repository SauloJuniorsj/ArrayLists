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
public class Par extends Numero {
    
    private int par;

    public Par(int n) {
        super(n);
    }

    public int getPar() {
        return par;
    }

    @Override
    public String toString() {
        
        return "Sou classe Par, nº " +super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}

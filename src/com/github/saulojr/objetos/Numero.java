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
public abstract class Numero {
    
   
    private int n ;
    
    public Numero(int n) {
       this.n = n;
    }
    
    @Override
    public String toString() {
     if(n % 2 == 0 ){
         return n + " sou Par";
     }
        return n + " sou Impar"; //To change body of generated methods, choose Tools | Templates.
    }

     
    
}

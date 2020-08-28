/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.objetos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Saulo Jr
 */
public class ComGithubSauloJrObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        
        ArrayList<Impar> NumImp = new  ArrayList<>();
        ArrayList<Par> NumPar = new  ArrayList<>();
        ArrayList<Numero> NumAmbos = new  ArrayList<>();
        
        NumImp.add(new Impar(5));
        NumImp.add(new Impar(89));
        NumPar.add(new Par(4));
        NumPar.add(new Par(534));
        NumAmbos.add(new Impar(765));
        NumAmbos.add(new Impar(35));
        NumAmbos.add(new Par(542));
        
        for(Impar i : NumImp){
            System.out.println(i);
        }
        
        for(Par p : NumPar){
            System.out.println(p);
        }
        for(Numero n : NumAmbos){
            System.out.println(n);
        }
    }
    
}

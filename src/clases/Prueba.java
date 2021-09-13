/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author argio
 */
public class Prueba {
     public static void main(String args[]) {
       
        AFN A1 = new AFN();
        A1.creaAFNBasico('c','a');
        
        // Conseguir el estado incial de un AFN su ID
        System.out.println(A1.getEdoInicial().getIdEstado());
        
        // Conseguir estados acepatacion de un AFN
        for(Estado e: A1.getEdosAcept()){
            System.out.println(e.getIdEstado()+"\ttoken:"+e.getToken());
        }
         System.out.println("\n");
        
        // Conseguir el ID de cada estado junto con su token y las transiciones que tiene ese AFN
        for(Estado e: A1.getEdosAFN()){
            System.out.println(e.getIdEstado()+"\ttoken:"+e.getToken());
            for(Transicion t: e.getTransiciones()){
                System.out.println(t.getSimbInf()+"\t"+t.getSimbSup());
            }
        }
         System.out.println("\n");
               
        // Conseguir el alfabeto AFN
        for(Character s: A1.getAlfabeto()){
            System.out.println(s.toString());
        }
         System.out.println("\n");
         
        AFN A2 = new AFN();
        A2.creaAFNBasico('f','e');
        A1.unirAFN(A2);
        
        for(Character s: A1.getAlfabeto()){
            System.out.println(s.toString());
        }System.out.println("\n");
        
        for(Character s: A2.getAlfabeto()){
            System.out.println(s.toString());
        }System.out.println("\n");
        
         for(Estado e: A1.getEdosAFN()){
            System.out.println(e.getIdEstado()+"\ttoken:"+e.getToken());
            for(Transicion t: e.getTransiciones()){
                System.out.println(t.getSimbInf()+"\t"+t.getSimbSup());
            }
        }
    }
}

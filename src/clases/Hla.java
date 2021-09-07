package clases;

import java.util.HashSet;


public class Hla {
     public static void main(String args[]) {
     AFN A1 = new AFN();
     AFN A2 = new AFN();
     
     A1.creaAFNBasico('e','b');
     A2.creaAFNBasico('b');
     A1.unirAFN(A2);
     //A1.imprimeAFN(1);
         System.out.println("\n\n");
     A1.cerrKleen();
     //A1.imprimeAFN(1);
     /*
     for(Estado e: A1.getEdosAFN()){
        System.out.println(e.getIdEstado()+""+e.getEdoAcept());
        for(Transicion t: e.getTransiciones()){
            System.out.println(t.getSimbInf()+""+t.getSimbSup());
        }
     }
  
     
     
     A1.unirAFN(A2);
         System.out.println(A1.getAlfabeto());
     for(Estado e: A1.getEdosAFN()){
        System.out.println(e.getIdEstado()+""+e.getEdoAcept());
       
     }*/
     }
}

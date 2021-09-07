package clases;

import java.util.HashSet;
import java.util.Stack;

public class AFN{
	static int contIdAFN = 0;
	Estado edoIni;
	HashSet<Estado> edosAFN = new HashSet<Estado>();
	HashSet<Estado> edosAcept = new HashSet<Estado>();
	HashSet<Character> alfabeto = new HashSet<Character>();
	public int idAFN;
        
       
	public AFN() {
		this.idAFN = contIdAFN++;
		this.edoIni = null;
		this.edosAFN.clear();
		this.edosAcept.clear();
		this.alfabeto.clear();
	}
	
	public AFN creaAFNBasico(char s) {
		Transicion t;
		Estado e1, e2;
		e1 = new Estado();
		e2 = new Estado();
		t = new Transicion(s, e2);
		e1.setTransicion(t);
		e2.setEdoAcept(true);
		this.alfabeto.add(s);
		this.edoIni = e1;
		this.edosAFN.add(e1);
		this.edosAFN.add(e2);
		this.edosAcept.add(e2);
		
		return this;
	}
        
	public AFN creaAFNBasico(int s) {
		Transicion t;
		Estado e1, e2;
		e1 = new Estado();
		e2 = new Estado();
		t = new Transicion((char)s, e2);
		e1.setTransicion(t);
		e2.setEdoAcept(true);
		this.alfabeto.add((char)s);
		this.edoIni = e1;
		this.edosAFN.add(e1);
		this.edosAFN.add(e2);
		this.edosAcept.add(e2);
		
		return this;
	}
	
	public AFN creaAFNBasico(char simbSup, char simbInf ) {
		char i;
		
		Transicion t;
		Estado e1, e2;
		e1 = new Estado();
		e2 = new Estado();
		t = new Transicion(simbSup, simbInf, e2);
		e1.setTransicion(t);
		e2.setEdoAcept(true);
		for(i=simbInf; i<=simbSup; i++) {
                    alfabeto.add(i);
		}
		edoIni = e1;
		edosAFN.add(e1);
		edosAFN.add(e2);
		edosAcept.add(e2);
		
		return this;
	}
	
	public AFN creaAFNBasico(int simbSup , int simbInf) {
		char i;
		
		Transicion t;
		Estado e1, e2;
		e1 = new Estado();
		e2 = new Estado();
		t = new Transicion((char)simbSup, (char)simbInf, e2);
		e1.setTransicion(t);
		e2.setEdoAcept(true);
		for(i=(char)simbSup; i<=(char)simbSup; i++) {
			alfabeto.add(i);
		}
		edoIni = e1;
		edosAFN.add(e1);
		edosAFN.add(e2);
		edosAcept.add(e2);
		
		return this;
	}
	
	public Estado getEdoInicial() {
            return edoIni;
	}

        public HashSet<Estado> getEdosAFN() {
            return edosAFN;
        }

        public HashSet<Estado> getEdosAcept() {
            return edosAcept;
        }

        public HashSet<Character> getAlfabeto() {
            return alfabeto;
        }
	
	public AFN unirAFN(AFN f2) {	//A|B
		Estado e1 = new Estado();
		Estado e2 = new Estado();
		
		Transicion t1 = new Transicion(SimbolosEspeciales.EPSILON, this.edoIni);
		Transicion t2 = new Transicion(SimbolosEspeciales.EPSILON, f2.edoIni);
		e1.setTransicion(t1);
		e1.setTransicion(t2);
		
		for(Estado e: this.edosAcept) {
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
			e.setEdoAcept(false);
		}
		for(Estado e: f2.edosAcept) {
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
			e.setEdoAcept(false);
		}
		this.edosAcept.clear();
		f2.edosAcept.clear();
		this.edoIni = e1;
		e2.setEdoAcept(true);
		this.edosAcept.add(e2);
		this.edosAFN.addAll(f2.edosAFN);
		this.edosAFN.add(e2);
		this.edosAFN.add(e1);
		this.alfabeto.addAll(f2.alfabeto);
		return this;
	}
	
	public AFN concaAFN(AFN f2) {		//AB
		for(Transicion t: f2.edoIni.getTransiciones()) {
			for(Estado e: this.edosAcept) {
				e.setTransicion(t);
				e.setEdoAcept(false);
			}
		}
		f2.edosAFN.remove(f2.edoIni);
		this.edosAcept = f2.edosAcept;
		this.edosAFN.addAll(f2.edosAFN);
		this.alfabeto.addAll(f2.alfabeto);
		
		return this;
	}
	
	public AFN cerrPos() {		//+
		Estado e1 = new Estado();
		Estado e2 = new Estado();
		
		e1.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, edoIni));
		for(Estado e: edosAcept) {
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, edoIni));
			e.setEdoAcept(false);
		}
		e2.setEdoAcept(true);
		
		edoIni = e1;
		edosAcept.clear();
		edosAcept.add(e2);
		edosAFN.add(e1);
		edosAFN.add(e2);
		
		return this;
	}
	
	public AFN cerrKleen() {		//*
		Estado e1 = new Estado();
		Estado e2 = new Estado();
		
		e1.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, edoIni));
		for(Estado e: edosAcept) {
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, edoIni));
			e.setEdoAcept(false);
		}
		e2.setEdoAcept(true);
		e1.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
		
		edoIni = e1;
		edosAFN.add(e1);
		edosAFN.add(e2);
		edosAcept.clear();
		edosAcept.add(e2);
		
		return this;
	}
	
	public AFN cerrOpcional() {		//?
		Estado e1 = new Estado();
		Estado e2 = new Estado();
		
		e1.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, edoIni));
		for(Estado e: edosAcept) {
			e.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
			e.setEdoAcept(false);
		}
		e2.setEdoAcept(true);
		e1.setTransicion(new Transicion(SimbolosEspeciales.EPSILON, e2));
		
		edoIni = e1;
		edosAFN.add(e1);
		edosAFN.add(e2);
		edosAcept.clear();
		edosAcept.add(e2);
		
		return this;
	}
	
	//Funciones
	
	public HashSet<Estado> cerraduraEpsilon(Estado e){
		HashSet<Estado> conjunto = new HashSet<Estado>();
		Stack<Estado> stackDeEstados = new Stack<Estado>();
		Estado aux;
		
		stackDeEstados.push(e);
		conjunto.add(e);
		
		while(!stackDeEstados.empty()) {
			aux = stackDeEstados.pop();
			
			for(Transicion t: aux.getTransiciones()) {
				if(!conjunto.contains(t.getEdoTransicion(SimbolosEspeciales.EPSILON)) && t.getEdoTransicion(SimbolosEspeciales.EPSILON)!=null) {
					conjunto.add(t.getEdoTransicion(SimbolosEspeciales.EPSILON));
					stackDeEstados.push(t.getEdoTransicion(SimbolosEspeciales.EPSILON));
				}
			}
		}
		
		return conjunto;
	}
	
	public HashSet<Estado> moverA(Estado e, char item){
		HashSet<Estado> salidaEstados = new HashSet<Estado>();
		Estado aux;
		
		for(Transicion t: e.getTransiciones()) {
			aux = t.getEdoTransicion(item);
			if(aux !=null) {
				salidaEstados.add(aux);
			}
		}
		
		return salidaEstados;
	}
	
	public HashSet<Estado> moverA(HashSet<Estado> es, char item){
		HashSet<Estado> salidaEstados = new HashSet<Estado>();
		Estado aux;
		
		for(Estado e: es) {
			for(Transicion t: e.getTransiciones()) {
				aux = t.getEdoTransicion(item);
				if(aux !=null) {
					salidaEstados.add(aux);
				}
			}
		}
		
		return salidaEstados;
	}
	 
	
}
package clases;

public class Transicion{
	private char simbInf1;
	private char simbSup1;
	private Estado edo;
	
	public Transicion(char simb, Estado e) {
		this.simbInf1 = this.simbSup1 = simb; 
		this.edo = e;
	}
	
	public Transicion(char simbSup, char simbInf, Estado e) {
		this.simbInf1 = simbInf;
		this.simbSup1 = simbSup;
		this.edo = e;
	}
	
	public Transicion() {
		this.edo = null;
	}
	
	public void setTransicion( char simbSup, char simbInf, Estado e) {
		this.simbInf1 = simbInf;
		this.simbSup1 = simbSup;
		this.edo = e;
	}
	
	public void setTransicion(char simb, Estado e) {
		this.simbInf1 = this.simbSup1 = simb;
		this.edo = e;
	}
	
	public char getSimbInf() {
		return this.simbInf1;
	}
	
	public void setSimbInf(char simbInf) {
		this.simbInf1 = simbInf;
	}
	
	public char getSimbSup() {
		return this.simbSup1;
	}
	
	public void setSimbSup(char simbSup) {
		this.simbSup1 = simbSup;
	}
	
	public Estado getEdoTransicion(char s) {
		if(simbInf1<=s && s<=simbSup1) {
			return edo;
		}
		return null;
	}
}
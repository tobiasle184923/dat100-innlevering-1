package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
	//Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) 
	//og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.	

	String heltallInput = showInputDialog("Skriv inn et heltall over 0: ");
	int heltall = parseInt(heltallInput);
	
	if(heltall <= 0) {
		String feilTxt = "Ugyldig nummer";
		showMessageDialog(null,feilTxt);
	}else {
	
	int fakultet = 1;
	for(int i = heltall; i > 1; i--) {
		fakultet = fakultet * i;
		
	}
	String sumTxt = "Fakultetet av heltallet ditt er: " + fakultet;
	showMessageDialog(null,sumTxt);
	}

}}

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
//Trinnskatt
	
	public static void main(String[] args) {
	
		//En trinnskatt er en progressiv skatt på bruttolønn som beregnes når
		//inntekten er høyere enn 208 050 kr.
		//Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten dvs. 
		//det beløpet som personen skal betale i trinnskatt.

		String bruttoinntekt = showInputDialog("Bruttoinntekt: ");
		int svar = parseInt(bruttoinntekt);
		
		if(svar>=0 && svar<=208050) {
			System.out.println("Ingen trinnskatt. Bruttoinntekten din er " + svar + " kroner.");
			
		}else if(svar>=208051 && svar<=292850) {
			System.out.println("Trinnskatt 1. Bruttoinntekten din er " + svar * 0.993 + " kroner.");
			
		}else if(svar>=292851 && svar<=670000) {
			System.out.println("Trinnskatt 2. Bruttoinntekten din er " + svar*0.96 + " kroner.");
		
		}else if(svar>=670001 && svar<=937900) {
			System.out.println("Trinnskatt 3. Bruttoinntekten din er " + svar*0.864 + " kroner.");
			
		}else if(svar>=937901 && svar<=1350000) {
			System.out.println("Trinnskatt 4. Bruttoinntekten din er " + svar*0.844 + " kroner.");
			
		}else {
			System.out.println("Trinnskatt 5. Bruttoinntekten din er " + svar*0.824 + " kroner.");
		}
	}

}

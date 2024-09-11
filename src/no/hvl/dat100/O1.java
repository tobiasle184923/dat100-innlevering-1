package no.hvl.dat100;

import static java.util.Scanner.*;

import java.util.Scanner;

public class O1 {
//Karakterskala
	
	public static void main(String[] args) {

			Scanner resultat = new Scanner(System.in);
			for(int i = 0; i < 10; i++) {
				int poengsum;
				
			while(true){
				System.out.println("Skriv inn poengsummen (0-100):");
				poengsum = resultat.nextInt();
			
			if(poengsum <= 100 && poengsum >= 0) {
				break;
			}else {
				System.out.println("Ugyldig poengsum. Skriv et tall mellom 0-100");
			}
			}
				
			if(poengsum >= 90) {
				System.out.println("Karakter A");
			}else if(poengsum >= 80) {
				System.out.println("Karakter B");
			}else if(poengsum >= 60) {
				System.out.println("Karakter C");
			}else if(poengsum >= 50) {
				System.out.println("Karakter D");
			}else if(poengsum >= 40) {
				System.out.println("Karakter E");
			}else if(poengsum >= 0) {
				System.out.println("Karakter F");
			}else {}
			
			
				
				
				

	}

}}

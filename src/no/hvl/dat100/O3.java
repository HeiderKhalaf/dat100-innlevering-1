package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv inn et tall: ");
		int n = scanner.nextInt();
		
		int resultat = factorial(n);
		System.out.println("faktoren av " + n + " er " + resultat);
		
		
	}
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}else {
			return n * factorial(n - 1);
			
		}
			

			
			
				
	}

	
}
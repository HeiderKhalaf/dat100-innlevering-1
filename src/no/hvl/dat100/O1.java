package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		
		for (int student = 1; student <= 10; student++) {
			
			String input = showInputDialog("Skriv inn poengsum for student " + student + ":");
			
			int i = Integer.parseInt(input);

				
		if (i <= 100 && i >= 90) {
			System.out.println("Karakteren du har fått er A");
		} else if (i <= 89 && i >= 80) {
			
			System.out.println("Karakteren du har fått er B");
		} else if (i <= 79 && i >= 60) {
			
			System.out.println("Karakteren du har fått er C");
		} else if (i <= 59 && i >= 50) {
			
			System.out.println("Karakteren du har fått er D");
		} else if (i <= 49 && i >= 40) {
			
			System.out.println("Karakteren du har fått er E");
		} else if (i < 39 && i >= 0) {
			
			System.out.println("Du har strøket!");
		} else {
			System.out.println("Ugyldig verdi");
			student--;
		
		}
		
		}

	}
}

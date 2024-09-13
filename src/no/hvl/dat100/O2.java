package no.hvl.dat100;

import java.lang.Math;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn inntekt : ");
        double inntekt = Double.parseDouble(input);
        double totalSkatt = 0;

        if (inntekt > 1350000) {
            totalSkatt += (inntekt - 1350000) * 0.176;
            inntekt = 1350000;
        }
        if (inntekt > 937900) {
            totalSkatt += (inntekt - 937900) * 0.166;
            inntekt = 937900;
        }
        if (inntekt > 670000) {
            totalSkatt += (inntekt - 670000) * 0.136;
            inntekt = 670000;
        }
        if (inntekt > 292850) {
            totalSkatt += (inntekt - 292850) * 0.04;
            inntekt = 292850;
        }
        if (inntekt > 208250) {
            totalSkatt += (inntekt - 208250) * 0.017;
        }

        System.out.println("Total trinnskatt: " + Math.round(totalSkatt) + " kr");
    }
}
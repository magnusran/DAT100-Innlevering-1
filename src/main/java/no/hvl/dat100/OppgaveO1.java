package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class OppgaveO1 {
    public static void main(String[] args) {
        double brutto = parseDouble(showInputDialog("Bruttolønn:"));

        double[] trinnProsenter = {
                0.017, // Trinn 1
                0.04,  // Trinn 2
                0.136, // Trinn 3
                0.166, // Trinn 4
                0.176  // Trinn 5
        };

        // Liste med nedre grenser for trinn.
        double[] trinnGrenser = {
                208050,  // Trinn 1
                292850,  // Trinn 2
                670000,  // Trinn 3
                937900,  // Trinn 4
                1350000, // Trinn 5
        };

        double[] trinnSkattesatser = new double[4];

        for (int i = 0; i < trinnGrenser.length - 1; i++) {
            trinnSkattesatser[i] = (trinnGrenser[i + 1] - trinnGrenser[i]) * trinnProsenter[i];
        }

        double trinnskatt = 0.0;

        for (int i = 0; i < trinnGrenser.length; i++) {
            if (brutto >= trinnGrenser[i]) {
                double skatt = 0.0;
                double skatt1 = (brutto - trinnGrenser[i]) * trinnProsenter[i];
                if(i!=4) {
                    if (brutto <= trinnGrenser[i + 1]) {
                        skatt = skatt1;
                    } else {
                        skatt = trinnSkattesatser[i];
                    }
                } else {
                    skatt = skatt1;
                }
                trinnskatt += skatt;
                System.out.println(skatt);
            }
        }

        showMessageDialog(null, "Trinnskatt: " + trinnskatt + "kr");

    }
}
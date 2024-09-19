package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int poengsum;
            do {
                poengsum = Integer.parseInt(showInputDialog("Poengsum student " + (i + 1) + ":"));
                if (poengsum < 0 || poengsum > 100)
                    showMessageDialog(null, "Poengsum må være mellom 0 og 100!");
            } while (poengsum < 0 || poengsum > 100);

            String karakter;

            if (poengsum <= 39) {
                karakter = "F";
            } else if (poengsum <= 49) {
                karakter = "E";
            } else if (poengsum <= 59) {
                karakter = "D";
            } else if (poengsum <= 79) {
                karakter = "C";
            } else if (poengsum <= 89) {
                karakter = "B";
            } else {
                karakter = "A";
            }
            System.out.println("Karakter student " + (i + 1) + ": " + karakter);
        }
    }
}
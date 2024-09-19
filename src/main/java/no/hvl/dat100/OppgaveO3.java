package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
    public static void main(String[] args) {
        int n = parseInt(showInputDialog("Skriv inn tall over 0:"));
        int nFakultet = 1;
        for (int i = 1; i <= n; i++) {
            nFakultet *= i;
        }
        showMessageDialog(null, "n! = " + nFakultet);
    }
}

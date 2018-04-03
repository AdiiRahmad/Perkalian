/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

import java.util.Scanner;

/**
 *
 * @author AdiRahmad
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perkalian kali = new Perkalian();
        System.out.println(kali.Kali(-100, 3));
    }

    public int Kali(int bilanganA, int bilanganB) {
        int hasil = 0;

        if (bilanganA <= 0) {
            for (int i = 0; i < bilanganB; i++) {
                hasil = hasil + bilanganA;
            }
        }
        if (bilanganA <= 0 && bilanganB <= 0) {
            for (int i = 0; i > bilanganB; i--) {
                hasil = hasil -(bilanganA) ;
            }
        }
        for (int i = 0; i < bilanganA; i++) {
            hasil = hasil + bilanganB;
        }
        return hasil;
    }
}

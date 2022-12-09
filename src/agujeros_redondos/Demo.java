/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agujeros_redondos;

import agujeros_redondos.RoundHole;
import agujeros_redondos.RoundPeg;
import agujeros_redondos.SquarePeg;
import agujeros_redondos.SquarePegAdapter;

public class Demo {
  public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("La clavija redonda r5 encaja en el agujero redondo r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // Agujero encaja //

        // Adaptador resuelve el problema
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("La clavija cuadrada w2 encaja en el agujero redondo r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("La clavija cuadrada w20 no encaja en el agujero redondo r5.");
        }
    }  
}

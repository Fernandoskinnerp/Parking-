/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author Estudiantes
 */
public class Conductor {

    int NiveldeAlcohol;
    String genero;

    boolean ebrio() {
        if (NiveldeAlcohol > 1) {
            return true;

        } else {
            return false;
        }
    }
}
 

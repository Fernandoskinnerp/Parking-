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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Celador miCelador=new Celador();
        
         Conductor Cesar = new Conductor();{
    Cesar.NiveldeAlcohol=3;
    Cesar.genero="hombre";
    
    
}
     Conductor Marta = new Conductor();{
    Marta.NiveldeAlcohol=4;
    Marta.genero="mujer";
}
     Conductor Pablo = new Conductor();{
    Pablo.NiveldeAlcohol=0;
    Pablo.genero="hombre";
}
     Conductor Sara = new Conductor();{
    Sara.NiveldeAlcohol=0;
    Sara.genero="mujer";
        
        
    }  
              
        // TODO code application logic here
    }
    
}

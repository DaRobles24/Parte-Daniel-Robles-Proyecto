/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte.del.proyecto.daniel;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class ParteDelProyectoDaniel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Visitante visitante1 = new Visitante("Sofia", "Milanes", "19", "15/2/2024");
        Visitante visitante2 = new Visitante("Diego", "Lopez", "11", "19/3/2024");
        Visitante visitante3 = new Visitante("Lucia", "Gomez", "23", "22/4/2024");
        Visitante visitante4 = new Visitante("Roney", "Robles", "9", "15/1/2024");
        Visitante visitante5 = new Visitante();
        //creamos el codigo para solicitar los datos mediante teclado

        //mostramos resultado en pantalla
        
        visitante1.mostrarInfoPrecargada();
        visitante5.setearInfo();
        visitante1.mostrarInfoExtra();
       

        
        
    
    }

}

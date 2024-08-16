/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte.del.proyecto.daniel;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Visitante {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    //creamos la clase carro y ponemos los atributos (carac)
    String Nombre;
    String Apellido;
    String Edad;
    String FechaIngreso;
   
    int TotalNinos = 2;
    int TotalAdultos = 2;
    int visi = 4;
    
    //creamos el metodo constructor para tener informacion precargada
    public Visitante(String Nombre, String Apellido, String Edad, String FechaIngreso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.FechaIngreso = FechaIngreso;
        actualizarContadores();
    }
    
    //Creamos el metodo constructor vacio para asi poder llenarlo mediante el teclado

    public Visitante() {
    }
    
  //cramos los getters and setters

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String Apellido) {
            this.Apellido = Apellido;
        }

        public String getEdad() {
            return Edad;
        }

        public void setEdad(String Edad) {
            this.Edad = Edad;
        }

        public String getFechaIngreso() {
            return FechaIngreso;
        }

        public void setFechaIngreso(String FechaIngreso) {
            this.FechaIngreso = FechaIngreso;
        }
        
        // Método para actualizar los contadores
    private void actualizarContadores() {
        visi++;
        if (Integer.parseInt(this.Edad) < 13) {
            TotalNinos++;
        } else {
            TotalAdultos++;
        }
    }
        
        //creamos el metodo para agregar nombre x usuario
        public void setearInfo (){
           
            
            while (true) {  
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
                setNombre(nombre);

                String apellido = JOptionPane.showInputDialog("Ingrese su Apellido:");
                setApellido(apellido);

                String edad = JOptionPane.showInputDialog("Ingrese su Edad:");
                setEdad(edad);

                String fecha = JOptionPane.showInputDialog("Ingrese la fecha de visita:");
                setFechaIngreso(fecha);

                String rp = JOptionPane.showInputDialog("Desea agregar otra visita");

                visi++;

                

                System.out.println("------ Visitante" + visi + " ------");
                System.out.println("Nombre del visitante:" +  getNombre());
                System.out.println("Apellido del visitante:" + getApellido());
                System.out.println("Edad del visitante:" + getEdad());
                System.out.println("Fecha de Ingreso:" + getFechaIngreso());

                
                if (rp.equalsIgnoreCase("n")) {
                    break;
                }

            }
                
         }
        
            
    
        //creamos el metodo para agregar nombre x usuario

        public void mostrarInfoPrecargada (){
            Visitante visitante1 = new Visitante("Sofia", "Milanes", "19", "15/2/2024");
            Visitante visitante2 = new Visitante("Diego", "Lopez", "11", "19/3/2024");
            Visitante visitante3 = new Visitante("Lucia", "Gomez", "23", "22/4/2024");
            Visitante visitante4 = new Visitante("Roney", "Robles", "9", "15/1/2024");
            
            System.out.println("------ Visitante 1 ------");
            System.out.println("Nombre del visitante:" + visitante1.Nombre);
            System.out.println("Apellido del visitante:" + visitante1.Apellido);
            System.out.println("Edad del visitante:" + visitante1.Edad);
            System.out.println("Fecha de Ingreso:" + visitante1.FechaIngreso);


            System.out.println("------ Visitante 2 ------");
            System.out.println("Nombre del visitante:" + visitante2.Nombre);
            System.out.println("Apellido del visitante:" + visitante2.Apellido);
            System.out.println("Edad del visitante:" + visitante2.Edad);
            System.out.println("Fecha de Ingreso:" + visitante2.FechaIngreso);


            System.out.println("------ Visitante 3 ------");
            System.out.println("Nombre del visitante:" + visitante3.Nombre);
            System.out.println("Apellido del visitante:" + visitante3.Apellido);
            System.out.println("Edad del visitante:" + visitante3.Edad);
            System.out.println("Fecha de Ingreso:" + visitante3.FechaIngreso);

        
            System.out.println("------ Visitante 4 ------");
            System.out.println("Nombre del visitante:" + visitante4.Nombre);
            System.out.println("Apellido del visitante:" + visitante4.Apellido);
            System.out.println("Edad del visitante:" + visitante4.Edad);
            System.out.println("Fecha de Ingreso:" + visitante4.FechaIngreso);

            System.out.println("-------------------------");
        }
        
        //creamos otro metodo para mostrar informacion extra
        public void mostrarInfoExtra (){ 
            System.out.println("------ Informacion Extra ------");
            System.out.println("Cantidad de visitantes del dia de hoy: " + visi);
            System.out.println("Cantidad de niños: " + TotalNinos);
            System.out.println("Cantidad de adultos: " + TotalAdultos);
        }
}

    
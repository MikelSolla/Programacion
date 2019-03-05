package ejercicio1_basedatos;

import Ventanas.*;
import BaseDatos.*;
import UML.*;
public class Ejercicio1_BaseDatos {

    private static Ventana1 v;
    private static Conexion CBD;
            
    
    public static void main(String[] args) throws Exception {
        añadir();
        CBD = new Conexion();
        CBD.conectar();
        datoscorrectos();
    }
    
    public static void añadir(){
        v = new Ventana1();
        v.setVisible(true);
    }
    public static void datoscorrectos(){
        
    }
}

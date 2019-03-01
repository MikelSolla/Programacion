package ejercicio1_basedatos;

import Ventanas.*;
public class Ejercicio1_BaseDatos {

    private static Ventana1 v;
    
    public static void main(String[] args) {
        
        añadir();
    }
    
    public static void añadir(){
        v = new Ventana1();
        v.setVisible(true);
    }
}

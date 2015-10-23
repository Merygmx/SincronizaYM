package sincroniza;
/**
 * Este programa es un ejemplo del uso de hilos
 * @author YMGM y JMMMM
 */
public class Sincroniza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Objeto en comun, se encarga del wait y notify
        Saludo s = new Saludo();
       
        /*Instancio los hilos y le paso como parametros:
         *
         * El Nombre del Hilo(en este caso es el nombre del personal)
         * ----El objeto en comun (Saludo)----
         * Un booleano para verificar si es jefe o empleados
         * "Pepe es el nombre de la persona, s es la instancia de saludo
         * y la variable booleana para indicar si es jefe o es empleado
         *
        */       
        Personal Empleado1 = new Personal("Pepe", s, false);
        Personal Empleado2 = new Personal("José", s, false);
        Personal Empleado3 = new Personal("Pedro", s, false);
        Personal Jefe1 = new Personal("JEFE", s, true);
       
             //Lanzo los hilos   
            //
            Empleado1.start();           
            Empleado2.start();           
            Empleado3.start();           
            Jefe1.start();
        
        
        
    }
}

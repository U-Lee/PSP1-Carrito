package carritopelis;

/*
 *Clase main
 *
 * @versión 1.0   Fecha 10/12/2017
 * @author Omar Ulises Hernández Cervantes, Oswaldo Josue Hernández Juárez
 */
public class CarritoPelis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPeliculas ventana = new VentanaPeliculas();
        ventana.setTitle("Compra peliculas");
        ventana.setVisible(true);
    }

}

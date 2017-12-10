package carritopelis;

import javax.swing.JOptionPane;

/**
 *
 * @author Omar Ulises Hernández Cervantes, Oswaldo Josue Hernández Juárez
 */
public class CapturaDatos {

    String pedirID() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el ID de la película:");
        return nombre;
    }

    String pedirTitulo() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el Titulo de la "
                + "película:");

        return nombre;
    }

    String pedirActor() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el nombre del Actor "
                + "principal de la película:");
        return nombre;
    }

    String pedirGenero() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Escribe el género "
                + "de la película:");
        return nombre;
    }

    String pedirPrecio() {
        String precio;
        int x;
        do {
            precio = JOptionPane.showInputDialog("Escribe el precio "
                    + "de la película:");
            x = Integer.parseInt(precio);
            if (x < 10 || x > 500) {
                JOptionPane.showMessageDialog(null, "Ingresa un precio dentro "
                        + "del rango establecido ($10 - $500)", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        } while (x < 10 || x > 500);
        return precio;
    }
}

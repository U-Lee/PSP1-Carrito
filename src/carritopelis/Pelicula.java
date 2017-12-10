package carritopelis;

/*
 * Clase que contiene la creación del objeto pelicula
 *
 * @versión 1.0   Fecha 10/12/2017
 * @author Omar Ulises Hernández Cervantes, Oswaldo Josue Hernández Juárez
 */
public class Pelicula {

    String ID, titulo, actor, genero, precio; // Declaración de variables

    /**
     *
     * @param ID Cadena que almacena del ID de la película
     * @param titulo Cadena que almacena el nombre de la película
     * @param actor Cadena que almacena el nombre del actor principal de la
     * película
     * @param genero Cadena que almacena el género al que pertenece la película
     * @param precio Cadena que almacena el precio de venta de la película
     */
    public Pelicula(String ID, String titulo, String actor, String genero,
            String precio) {
        this.ID = ID;
        this.titulo = titulo;
        this.actor = actor;
        this.genero = genero;
        this.precio = precio;
    }

    public String getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getActor() {
        return actor;
    }

    public String getGenero() {
        return genero;
    }

    public String getPrecio() {
        return precio;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

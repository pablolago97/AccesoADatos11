package aleatorio;

/**
 *
 * @author Pablo
 */
public class Producto {

    private final String codigo;
    private final String descripcion;
    private final double precio;

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    public static String rellenaEspacio(String word, int num) {
        int nCaracteres = word.length();
        for (int i = nCaracteres; i < num; i++) {
            word += " ";
        }
        return word;
    }

}

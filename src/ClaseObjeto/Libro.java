package ClaseObjeto;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private double precio;
    private String numerolibro;
    private String fecha;
    private String descuento;

    // Constructor sin parámetros
    public Libro() {

    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, double precio, String numerolibro, String fecha, String descuento) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.numerolibro = numerolibro;
        this.fecha = fecha;
        this.descuento = descuento;
    }

    //Metodo para mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + precio + " Quetzales ");
        System.out.println("Numero de libro: " + numerolibro );
        System.out.println("Fecha: " + fecha  );
        System.out.println("Descuento: " + descuento );
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio del libro" + titulo + " es " + nuevoPrecio + " Quetzales ");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNumerolibro() {
        return numerolibro;
    }

    public void setNumerolibro(String numerolibro) {
        this.numerolibro = numerolibro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

}

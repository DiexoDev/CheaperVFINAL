package model;

public class Productos {

    protected String nombre;
    protected String ruta;
    protected double precio;
    protected int id;
    protected TipoRopa tipo;

    public Productos() {
        int valor = (int) (Math.random() * 100);
        this.id = valor;
    }

    public Productos(int id, String nombre, double precio, TipoRopa tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    //Constructores usados en MenuCompras
    public Productos(int id, String nombre, double precio, TipoRopa tipo, String ruta) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public Productos(String nombre, double precio, TipoRopa tipo, String ruta) {
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoRopa getTipo() {
        return tipo;
    }

    public void setTipo(TipoRopa tipo) {
        this.tipo = tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", ruta=" + ruta + ", precio=" + precio + ", id=" + id + ", tipo=" + tipo + '}';
    }

}

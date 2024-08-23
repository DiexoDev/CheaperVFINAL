package model;

public class Usuarios {
    protected String nombre;
    protected String correoElectronico;
    protected String contrasena;
    protected int edad;
    protected String genero;
    protected long numeroTel;
    private static int contadorUsuarios;
    protected int id;

    public Usuarios(){
        this.id = contadorUsuarios++;
    }
    
    public Usuarios(String nombre, String correoElectronico, String contrasena, int edad, String genero, long numeroTel) {
        this();
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.edad = edad;
        this.genero = genero;
        this.numeroTel = numeroTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(long numeroTel) {
        this.numeroTel = numeroTel;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "ID ="+ id + "nombre= " + nombre + ", correo electronico= " + correoElectronico + ", edad= " + edad + ", genero= " + genero + ", numero= " + numeroTel + '}';
    }
    
    
    
    
    
}

package boletin30;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    
    int id, edad;
    String nombre, apelidos;

    public SeleccionFutbol(int id, int edad, String nombre, String apelidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apelidos = apelidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apelidos=" + apelidos + '}';
    }
    
    
}

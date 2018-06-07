package boletin30;

public class Entrenador extends SeleccionFutbol {

    int idFederacion;

    public Entrenador(int id, int edad, String nombre, String apelidos, int idFederacion) {
        super(id, edad, nombre, apelidos);
    }

  

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNompre() {
        return nombre;
    }

    public void setNompre(String nompre) {
        this.nombre = nompre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }


    @Override
    public String toString() {
        return "Entrenador{" +" id: "+ id +", edad: "+edad+ ", nombre: "+nombre+ ", apellido: "+apelidos + ", idFederacion=" + idFederacion + '}';
    }
    
    
    
    @Override
    public void concentrarse() {
        System.out.println("Se concentra el Entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el entrenador");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica el entrenamiento");
    }
    
}

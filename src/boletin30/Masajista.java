package boletin30;

public class Masajista extends SeleccionFutbol {
    
    String titulacion;
    int aniosExperiencia;

    public Masajista(int id, int edad, String nombre, String apelidos, String titulacion, int aniosExperienia) {
        super(id, edad, nombre, apelidos);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
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

    @Override
    public String getApelidos() {
        return apelidos;
    }

    @Override
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    @Override
    public String toString() {
        return "Masajista{" +" id: "+ id +", edad: "+edad+ ", nombre: "+nombre+ ", apellido "+apelidos + ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
      

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el masajista");
    }
    @Override
    public void viajar() {
        System.out.println("Viaja el masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el masajista");
    }
    
    public void darMasaje(){
        System.out.println("El masajista da un masaje");
    }
    
}

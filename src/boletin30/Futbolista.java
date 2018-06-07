package boletin30;

public class Futbolista extends SeleccionFutbol {

    int dorsal;
    String demarcacion;

    public Futbolista(int id, int edad, String nombre, String apelidos, int dorsal, String demarcacion) {
        super(id, edad, nombre, apelidos);
        this.nombre=nombre;
        this.apelidos=apelidos;
    }


    
//    public Futbolista()

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
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
        return "Futbolista{" +" id: "+ id +", edad: "+edad+ ", nombre: "+nombre+ ", apellido "+apelidos +", dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

    
 
    
    
    @Override
    public void concentrarse() {
        System.out.println("Se concentra el jugador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el jugador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el jugador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el jugador");
    }
    
    public void entrevista(){
        System.out.println("El jugador de una entrevista");
    }
}

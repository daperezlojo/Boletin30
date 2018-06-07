package boletin30;

import java.util.ArrayList;

public class Boletin30 {

    public static void main(String[] args) {

        SeleccionFutbol futbolista=new Futbolista(1,19,"Sergio","Sahuquillo",11,"extremo");
        SeleccionFutbol masajista=new Masajista(2,20,"Alberto","Perez","masajistapro",1);
        SeleccionFutbol entrenador=new Entrenador(3,55,"Vicente","Del Bosque",123);
        
        ArrayList<SeleccionFutbol> seleccion=new ArrayList();
        seleccion.add(futbolista);
        seleccion.add(masajista);
        seleccion.add(entrenador);
         
        
        for(SeleccionFutbol elemento:seleccion){
            System.out.println(elemento.toString());
        }
        
    }
    }
    


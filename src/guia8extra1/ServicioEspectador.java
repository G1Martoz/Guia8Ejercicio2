package guia8extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioEspectador {

    //LISTA DE ESPECTADORES
    private  ArrayList <Espectador> listaDeEspectadores = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    //GET&SET
    public ArrayList<Espectador> getListaDeEspectadores() {
        return listaDeEspectadores;
    }
    
    //METODO
    public void crearEspectador() {
        Espectador p1 = new Espectador();
        System.out.println("Ingrese su nombre");
            p1.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese la cantidad de dinero que posee");
        p1.setDinero(leer.nextInt());

        //AGREGAR P1 A LA LISTA
        listaDeEspectadores.add(p1);
    }
}

package guia8extra1;

import java.util.Scanner;

public class ServicioEspectador {
    Scanner leer = new Scanner(System.in);
    //METODO
    public void crearEspectador(){
        Espectador p1 = new Espectador();
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese la cantidad de dinero que posee");
        p1.setDinero(leer.nextInt());
        
    }
}

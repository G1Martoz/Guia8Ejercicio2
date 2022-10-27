package guia8extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPelicula {

    //CARTELERA
    ArrayList<Pelicula> cartelera = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList <Pelicula> getCartelera() {
        return cartelera;
    }

    //METODOS
    public void crearCartelera() {
        //crear pelicula
        Pelicula p3 = new Pelicula();
        //asigancion
        System.out.println("Ingrese el titulo");
        p3.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del director");
        p3.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula en minutos" + "\n" + "[EJEMPLO 120 MINUTOS]");
        p3.setDuracion(leer.nextInt());
        System.out.println("Ingrese la edad minima para ver la pelicula");
        Integer opcion;
        do {
        System.out.println("SELECCIONE LA CATEGORIA DE EDAD");
        System.out.println("---1. ATP Apta Para Todo Publico---");
        System.out.println("---2. A13 PARA MAYORES DE TRECE AÑOS---");
        System.out.println("---3. B15 PARA MAYORES DE QUINCE AÑOS---");
        System.out.println("---4. C18 PARA MAYORES DE DIECIOCHO AÑOS---");
        System.out.println("---5. D70 PARA MAYORES DE SETENTA AÑOS---");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
            p3.setEdadMinima(EnumPeggy.ATP);
            break;
            case 2:
            p3.setEdadMinima(EnumPeggy.A13);
            break;
            case 3:
            p3.setEdadMinima(EnumPeggy.B15);
            break;
            case 4:
            p3.setEdadMinima(EnumPeggy.C18);
            break;
            case 5:
            p3.setEdadMinima(EnumPeggy.D70);
            break;
        default:
            System.out.println("<<<OPCION INCORRECTA>>>");
          }
          } while (!(opcion > 0 && opcion < 6));
        
        //AGREGAR P3 A LA LISTA
        cartelera.add(p3);
    }
}

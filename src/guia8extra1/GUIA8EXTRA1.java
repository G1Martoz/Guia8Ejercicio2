package guia8extra1;

public class GUIA8EXTRA1 {

    public static void main(String[] args) {

        SalaCine nuevaSala = new SalaCine();
        //CREAR PELICULA
        ServicioPelicula newPeli = new ServicioPelicula();
        newPeli.crearCartelera();

        //CREAR ESPECTADORES
        ServicioEspectador visor1 = new ServicioEspectador();
        for (int i = 0; i < 3; i++) {
            visor1.crearEspectador();
            
        }
        //CREAR SALA
        nuevaSala.agregarPelicula(newPeli.getCartelera().get(0));
        Espectador a = visor1.getListaDeEspectadores().get(0);
        nuevaSala.agregarEspectador(a);
        visor1.getListaDeEspectadores().remove(a);
        a = visor1.getListaDeEspectadores().get(0);
        nuevaSala.agregarEspectador(a);
        visor1.getListaDeEspectadores().remove(a);
        a = visor1.getListaDeEspectadores().get(0);
        nuevaSala.agregarEspectador(a);
        
        
        nuevaSala.mostrarSala();
       
    }

}

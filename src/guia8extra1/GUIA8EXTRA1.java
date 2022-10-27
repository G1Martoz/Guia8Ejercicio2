package guia8extra1;

public class GUIA8EXTRA1 {

    public static void main(String[] args) {
        //CREAR PELICULA
        ServicioPelicula newPeli = new ServicioPelicula();
        newPeli.crearCartelera();
        
        //CREAR ESPECTADORES
        ServicioEspectador visor1 = new ServicioEspectador();
        for (int i = 0; i < 3 ; i++) {
            visor1.crearEspectador();
        }
        //CREAR SALA
        SalaCine nuevaSala = new SalaCine();
        
        
    }

}

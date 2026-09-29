import java.util.ArrayList;
import modelo.Animais;
import modelo.Cachorro;
import modelo.Gato;

public class Main {

    public static void main(String[] args){

        Gato gato = new Gato("Mingau", 3, "Branco", true);

        Cachorro cachorro = new Cachorro("Rex", 5, 45.5f);
        
        System.out.println("\n--- Métodos ---");
        
        System.out.println("\n--- Gato ---");
        gato.miar();
        gato.arranhar();
        gato.mostrarCor();

        System.out.println("\n--- Cachorro ---");
        cachorro.latir();
        cachorro.rosnar();
        cachorro.tamanho();

        ArrayList<Animais> animais = new ArrayList<>();

        animais.add(gato);
        animais.add(cachorro);

        System.out.println("\n--- Métodos sobrescritos ---");

        gato.comer();
        cachorro.comer();

        System.out.println("\n--- Polimorfismo ---");

       for (Animais animal : animais) {
            animal.comer();
            animal.beber();
            animal.dormir();

            System.out.println(animal);
            System.out.println();
        }
    }
}
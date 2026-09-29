
import modelo.Cachorro;

public class Main{

    public static void main(String[] args) {
        System.out.println("Teste");

        Cachorro ch = new Cachorro("Nina", 4, 60.0f);
        ch.latir();
        ch.tamanho();
    }
}


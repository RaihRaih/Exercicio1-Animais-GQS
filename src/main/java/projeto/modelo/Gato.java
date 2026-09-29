package modelo;

public class Gato extends Animais {

    private String cor;
    private boolean temDono;

    public Gato(String nome, int idade, String cor, boolean temDono) {
        super(nome, idade);
        this.cor = cor;
        this.temDono = temDono;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTemDono() {
        return this.temDono;
    }

    public void setTemDono(boolean temDono) {
        this.temDono = temDono;
    }

    public void miar() {
        System.out.printf("%s está miando.%n", this.getNome());
    }

    public void arranhar() {
        System.out.printf("%s está arranhando.%n", this.getNome());
    }

    public void mostrarCor() {
        System.out.printf("%s tem a pelagem %s.%n",
                this.getNome(), this.getCor());
    }

    @Override
    public void comer() {
        System.out.printf("%s está comendo sua ração.%n",
                this.getNome());
    }
}
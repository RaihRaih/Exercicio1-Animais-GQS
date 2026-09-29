package modelo;

public class Cachorro extends Animais {
    private float tamanho;

    public Cachorro(String nome, int idade, float tamanho){
        super(nome, idade);
        this.tamanho = tamanho;
    }

    public float getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }

    public void latir(){
        System.out.printf("%s está latindo%n", this.getNome());
    }

    public void tamanho(){
        System.out.printf("%s tem %.2f cm de altura%n", this.getNome(), this.getTamanho());
    }

    public void rosnar(){
        System.out.printf("%s está rosnando%n", this.getNome());
    }

    @Override
    public void comer() {
        System.out.printf("%s está comendo a sua ração bem rápido!%n", this.getNome());
    }

}
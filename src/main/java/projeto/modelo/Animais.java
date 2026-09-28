package modelo;

public class Animais {

    private String nome;
    private int idade;

    public Animais(String nome,int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public String getNome() {
        return this.nome;
    }
        
        public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void comer(){
        System.out.printf("%s está comendo%n", this.nome);
    }

    public void beber(){
        System.out.printf("%s está bebendo%n", this.nome);
    }

    public void dormir(){
        System.out.printf("%s está dormindo%n", this.nome);
    }

    @Override
    public String toString(){
        return "Animal { Nome: " + this.nome + ", Idade: " + this.idade + " }";
    }
}
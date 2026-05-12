package academy.devGabriel.maratonajava.javaCore.associacao.dominio;

public class Jogador {
    private String nome;
    private int quantidadeCopas;
    private Time time;  //relação 1 --- N

    public Jogador(String nome){
        this.nome = nome;
    }
    public Jogador(String nome, int quantidadeCopas){
        this.nome = nome;
        this.quantidadeCopas = quantidadeCopas;
    }

    public void imprime() {
        System.out.println(nome + "\n" + time.getNome());
        //System.out.println(nome + ", Quantidade de copas: " + this.quantidadeCopas);
    }
    public void imprime2() {
        if(time == null) return;
        System.out.println(nome + " joga no " + time.getNome());    // não pode chamar time diretamente por que ele é um objeto
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}

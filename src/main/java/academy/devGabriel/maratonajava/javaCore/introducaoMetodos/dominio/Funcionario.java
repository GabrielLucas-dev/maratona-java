package academy.devGabriel.maratonajava.javaCore.introducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double total;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getTotal() {
        return total;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + "\n" +
                "Idade: " + this.idade
        );

        if(salarios == null) return;

        for (double s : salarios) {
            System.out.println(s);
        }
        System.out.println("Média: "+mediaSalarios());
    }

    public double mediaSalarios() {
        if (salarios == null) return 0;

        double quantidade = salarios.length;

        for (double s : salarios) {
            total += s;
        }
        return total / quantidade;
    }
}

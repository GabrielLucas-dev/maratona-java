package academy.devGabriel.maratonajava.javaCore.associacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime() {
        System.out.println("-------------");
        System.out.println(nome + ", " + especialidade);
        System.out.println("Seminarios: ");
        if(seminarios == null) return;
        for(Seminario seminario: seminarios){
            System.out.println(seminario.getTitulo());
        }
    }

    public void imprime2() {
        System.out.println("-------------");
        System.out.println(nome + ", " + especialidade);
        System.out.println("Seminario(s): ");
        if(seminarios == null) return;
        for(Seminario seminario: seminarios){
            System.out.println(seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.print("Alunos: ");
            for (Aluno aluno: seminario.getAlunos()) {
                System.out.print(aluno.getNome() + ", ");
            }
        }
    }

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}

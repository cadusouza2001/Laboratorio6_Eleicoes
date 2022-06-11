package eleicoes;

public class Candidato {

    String nome;
    Partidos partido;
    int idade;
    int votos;

    public Candidato(String nome, Partidos partido, int idade, int votos) {
        this.nome = nome;
        this.partido = partido;
        this.idade = idade;
        this.votos = votos;
    }

    public String getNome() {
        return nome;
    }

    public Partidos getPartido() {
        return partido;
    }

    public int getIdade() {
        return idade;
    }

    public int getVotos() {
        return votos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nPartido: " + partido +
                "\nIdade: " + idade +
                "\nVotos: " + votos + "\n";
    }
}

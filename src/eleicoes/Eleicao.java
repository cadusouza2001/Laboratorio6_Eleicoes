package eleicoes;

import comparadores.ComparaMaisVelho;
import comparadores.ComparaMaisVotado;

import java.util.ArrayList;
import java.util.List;

public class Eleicao {
    ArrayList<Candidato> candidatos;

    public Eleicao() {
        candidatos = new ArrayList<>();
    }

    public void ordenaPorVotos() {
        candidatos.sort(new ComparaMaisVotado());
    }

    public void ordenaPorIdade() {
        candidatos.sort(new ComparaMaisVelho());
    }

    public void adicionaCandidato(String nome, Partidos partido, int idade, int votos) {
        candidatos.add(new Candidato(nome, partido, idade, votos));
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = (ArrayList<Candidato>) candidatos;
    }

    public int getTotalVotos() {
        int soma = 0;
        for (Candidato candidato : candidatos) {
            soma += candidato.getVotos();
        }
        return soma;
    }

    public double getMediaVotos() {
        return (double) (getTotalVotos()) / candidatos.size();
    }

    public Candidato getPrimeiroDaLista() {
        return candidatos.get(0);
    }

    public Candidato getUltimoDaLista() {
        return candidatos.get(candidatos.size() - 1);
    }

}

package comparadores;

import eleicoes.Candidato;

import java.util.Comparator;

public class ComparaMaisVotado implements Comparator<Candidato> {

    @Override
    public int compare(Candidato o1, Candidato o2) {
        return Integer.compare(o1.getVotos(), o2.getVotos());
    }
}

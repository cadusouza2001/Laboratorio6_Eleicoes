package comparadores;

import eleicoes.Candidato;

import java.util.Comparator;

public class ComparaMaisVelho implements Comparator<Candidato> {

    @Override
    public int compare(Candidato o1, Candidato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

package ui;

import eleicoes.Candidato;
import eleicoes.Eleicao;
import eleicoes.Partidos;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Eleicao eleicaoBrasileira = new Eleicao();
        Eleicao eleicaoOrdenadaPorVotos = new Eleicao();
        Eleicao eleicaoOrdenadaPorIdade = new Eleicao();

        eleicaoBrasileira.adicionaCandidato("Josney", Partidos.UNI, 20, 93);
        eleicaoBrasileira.adicionaCandidato("Josias", Partidos.DUNI, 30, 75);
        eleicaoBrasileira.adicionaCandidato("Josilberto", Partidos.TE, 50, 12);
        eleicaoBrasileira.adicionaCandidato("Jonas", Partidos.SALAME, 40, 81);
        eleicaoBrasileira.adicionaCandidato("Jamur", Partidos.MINGUE, 15, 127);

        eleicaoOrdenadaPorVotos.setCandidatos(new ArrayList<>(eleicaoBrasileira.getCandidatos()));
        eleicaoOrdenadaPorVotos.ordenaPorVotos();

        eleicaoOrdenadaPorIdade.setCandidatos(new ArrayList<>(eleicaoBrasileira.getCandidatos()));
        eleicaoOrdenadaPorIdade.ordenaPorIdade();

        Scanner input = new Scanner(System.in);

        int resposta = 0;
        do {
            System.out.println("Por gentileza, escolha uma das opções a seguir:");
            System.out.println("1 - Imprimir informações de todos candidatos");
            System.out.println("2 - Imprimir candidato mais velho");
            System.out.println("3 - Imprimir candidato mais novo");
            System.out.println("4 - Imprimir candidato mais votado");
            System.out.println("5 - Imprimir candidato menos votado");
            System.out.println("6 - Imprimir total de votos");
            System.out.println("7 - Imprimir média de votos por usuário");
            System.out.println("8 - Sair");

            try {
                resposta = input.nextInt();
            } catch (Exception e) {
                System.out.println("Ocorreu um erro, tente novamente");
                input.nextLine(); //Sem isso o Scanner fica travado
            }

            switch (resposta) {
                case 1:
                    System.out.println("Lista de candidatos:");
                    for (Candidato candidato : eleicaoBrasileira.getCandidatos()) {
                        System.out.println(candidato.toString());
                    }
                    break;
                case 2:
                    System.out.println("Candidato mais velho:");
                    System.out.println(eleicaoOrdenadaPorIdade.getUltimoDaLista());
                    break;
                case 3:
                    System.out.println("Candidato mais novo:");
                    System.out.println(eleicaoOrdenadaPorIdade.getPrimeiroDaLista());
                    break;
                case 4:
                    System.out.println("Candidato com mais votos:");
                    System.out.println(eleicaoOrdenadaPorVotos.getUltimoDaLista());
                    break;
                case 5:
                    System.out.println("Candidato com menos votos:");
                    System.out.println(eleicaoOrdenadaPorVotos.getPrimeiroDaLista());
                    break;
                case 6:
                    System.out.println("Total de votos:");
                    System.out.println(eleicaoBrasileira.getTotalVotos());
                    break;
                case 7:
                    System.out.println("Media de votos:");
                    System.out.println(eleicaoBrasileira.getMediaVotos());
                    break;
                case 8:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Insira um número válido");
            }

        } while (resposta != 8);


    }
}

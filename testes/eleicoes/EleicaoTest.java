package eleicoes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Eleicao Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>jun 10, 2022</pre>
 */
public class EleicaoTest {
    Eleicao eleicao = new Eleicao();

    @Before
    public void before() throws Exception {
        eleicao.adicionaCandidato("Tony Stark", Partidos.UNI, 50, 932);
        eleicao.adicionaCandidato("Steve Rogers", Partidos.DUNI, 120, 987);
        eleicao.adicionaCandidato("Thor Odinson", Partidos.TE, 1000, 435);
        eleicao.adicionaCandidato("Natasha Romanoff", Partidos.SALAME, 25, 820);
        eleicao.adicionaCandidato("Peter Parker", Partidos.MINGUE, 16, 153);
    }

    @After
    public void after() throws Exception {
        eleicao.getCandidatos().clear();
    }

    /**
     * Method: ordenaPorVotos()
     */
    @Test
    public void testOrdenaPorVotos() throws Exception {
        eleicao.ordenaPorVotos();
        Assert.assertEquals(153, eleicao.getCandidatos().get(0).getVotos(), 0.0001);
        Assert.assertEquals(435, eleicao.getCandidatos().get(1).getVotos(), 0.0001);
        Assert.assertEquals(820, eleicao.getCandidatos().get(2).getVotos(), 0.0001);
        Assert.assertEquals(932, eleicao.getCandidatos().get(3).getVotos(), 0.0001);
        Assert.assertEquals(987, eleicao.getCandidatos().get(4).getVotos(), 0.0001);
    }

    /**
     * Method: ordenaPorIdade()
     */
    @Test
    public void testOrdenaPorIdade() throws Exception {
        eleicao.ordenaPorIdade();
        Assert.assertEquals(16, eleicao.getCandidatos().get(0).getIdade(), 0.0001);
        Assert.assertEquals(25, eleicao.getCandidatos().get(1).getIdade(), 0.0001);
        Assert.assertEquals(50, eleicao.getCandidatos().get(2).getIdade(), 0.0001);
        Assert.assertEquals(120, eleicao.getCandidatos().get(3).getIdade(), 0.0001);
        Assert.assertEquals(1000, eleicao.getCandidatos().get(4).getIdade(), 0.0001);
    }

    /**
     * Method: adicionaCandidato(String nome, Partidos partido, int idade, int votos)
     */
    @Test
    public void testAdicionaCandidato() throws Exception {
        eleicao.adicionaCandidato("T'Challa", Partidos.MINGUE, 35, 1200);
        Assert.assertEquals(6, eleicao.getCandidatos().size());
    }

    /**
     * Method: getTotalVotos()
     */
    @Test
    public void testGetTotalVotos() throws Exception {
        Assert.assertEquals(3327, eleicao.getTotalVotos());
    }

    /**
     * Method: getMediaVotos()
     */
    @Test
    public void testGetMediaVotos() throws Exception {
        Assert.assertEquals(665.4, eleicao.getMediaVotos(), 0.01);
    }


} 

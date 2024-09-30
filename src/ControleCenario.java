import java.util.Set;
public class ControleCenario {
    private Percurso percurso;
    private Conflito conflito;
    public ControleCenario(String nomeHeroi, String nomeVilao) {

        this.percurso = new Percurso(TipoCenario.INICIO);
        this.conflito = new Conflito(nomeHeroi,nomeVilao);
    }
    public void inicializarCenario()
    {
        boolean jogando = true;
        while (jogando) {
            percurso.imprimeInfo();
            int opcao = percurso.escolha();
            proximoCenario(opcao);
        }
    }
    public void proximoCenario(int numero) {
        Set<TipoCenario> cenariosFinais = Set.of(TipoCenario.FIM_FUGA, TipoCenario.FIM_DERROTA, TipoCenario.FIM_VITORIA);

        TipoCenario tipoAtual = percurso.getTipo();

        switch (tipoAtual) {
            case CAMINHO_DIREITA -> tratarCaminhoDireita(numero);
            case INICIO -> tratarInicio(numero);
            case CAMINHO_ESQUERDA -> tratarCaminhoEsquerda(numero);
            case BAU_TESOURO -> tratarBauTesouro(numero);
            case CAMPO_DE_BATALHA, CABANA_CACADOR -> tratarCampoCabana(numero);
            case SEGUIR_FRENTE -> tratarSeguirFrente(numero);
            default -> {
                if (cenariosFinais.contains(tipoAtual)) {
                    tratarCenariosFinais(numero);
                }
            }
        }
    }
    private void tratarCaminhoDireita(int numero) {
        if (numero == 0) {
            String ganhador = conflito.lutar();
            percurso.setTipo(ganhador.equals("inimigo") ? TipoCenario.FIM_DERROTA : TipoCenario.FIM_VITORIA);
        } else if (numero == 1) {
            percurso.setTipo(TipoCenario.FIM_FUGA);
        }
    }
    private void tratarInicio(int numero) {
        if (numero == 0) {
            percurso.setTipo(TipoCenario.CAMINHO_ESQUERDA);
        } else if (numero == 1) {
            percurso.setTipo(TipoCenario.CAMINHO_DIREITA);
        }
    }
    private void tratarCaminhoEsquerda(int numero) {
        if (numero == 0) {
            percurso.setTipo(TipoCenario.BAU_TESOURO);
            conflito.getHeroi().equipar(TipoCenario.BAU_TESOURO.getCenario().getRecompensa());
        } else if (numero == 1) {
            percurso.setTipo(TipoCenario.INICIO);
        }
    }
    private void tratarBauTesouro(int numero) {
        if (numero == 0) {
            percurso.setTipo(TipoCenario.CABANA_CACADOR);
            conflito.getHeroi().equipar(TipoCenario.CABANA_CACADOR.getCenario().getRecompensa());
        } else if (numero == 1) {
            percurso.setTipo(TipoCenario.CAMPO_DE_BATALHA);
            conflito.getHeroi().equipar(TipoCenario.CAMPO_DE_BATALHA.getCenario().getRecompensa());
        }
    }
    private void tratarCampoCabana(int numero) {
        if (numero == 0) {
            percurso.setTipo(TipoCenario.BAU_TESOURO);
            conflito.getHeroi().equipar(TipoCenario.BAU_TESOURO.getCenario().getRecompensa());
        } else if (numero == 1) {
            percurso.setTipo(TipoCenario.SEGUIR_FRENTE);
        }
    }
    private void tratarSeguirFrente(int numero) {
        if (numero == 0) {
            String ganhador = conflito.lutar();
            percurso.setTipo(ganhador.equals("inimigo") ? TipoCenario.FIM_DERROTA : TipoCenario.FIM_VITORIA);
        } else if (numero == 1) {
            percurso.setTipo(TipoCenario.FIM_FUGA);
        }
    }
    private void tratarCenariosFinais(int numero) {
        if (numero == 0) {
            conflito.getHeroi().desequiparTudo();
            conflito.getHeroi().setVida(Personagem.VIDA_MAX);
            conflito.getInimigo().setVida(Inimigo.VIDA_MAX);
            percurso.setTipo(TipoCenario.INICIO);
        } else if (numero == 1) {
            System.exit(0); // Encerra o jogo
        }
    }
}
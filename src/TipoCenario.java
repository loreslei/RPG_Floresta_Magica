
/**
 * @author GPT
 */


public enum TipoCenario {
        INICIO(
                new Cenario("Entrada da Floresta",
                        "Você está na entrada de uma floresta sombria. Há dois caminhos.",
                        new String[]{"esquerda", "direita"},null)
        ),
        CAMINHO_ESQUERDA(
                new Cenario("Caminho à Esquerda",
                        "O caminho à esquerda é tranquilo, mas você sente que está sendo observado.",
                        new String[]{"continuar", "voltar"},null)

        ),
        CAMINHO_DIREITA(
                new Cenario("Caminho à Direita",
                        "O caminho à direita é íngreme e perigoso. Um INIMIGO aparece!",
                        new String[]{"batalhar", "fugir"},null)
        ),
        BAU_TESOURO(
                new Cenario("Adentrando na Floresta",
                        "Você encontrou um bau de Tesouro e ganhou uma ARMA.",
                        new String[]{"esquerda", "direita"},new Arma("Espada"))
        ),
        CABANA_CACADOR(
                new Cenario("Cabana do Caçador",
                        "Você encontrou a casa do caçador e roubou uma ARMADURA.",
                        new String[]{"voltar", "seguir"},new Armadura("Armadura"))
        ),
        CAMPO_DE_BATALHA(
                new Cenario("Campo de batalha",
                        "Você encontrou varios esqueleto e no meio deles achou um ESCUDO.",
                        new String[]{"voltar", "seguir"},new Escudo("Escudo"))
        ),
        FIM_DERROTA(
                new Cenario("Ataque do INIMIGO",
                        "Você tentou enfrentar o INIMIGO, mas foi derrotado.",
                        new String[]{"inicio","encerrar"},null)
        ),
        FIM_FUGA(
                new Cenario("Fuga Bem-Sucedida",
                        "Você conseguiu fugir do INIMIGO e voltar à entrada da floresta.",
                        new String[]{"inicio","encerrar"},null)
        ),
        FIM_VITORIA(
                new Cenario("Vitória sobre o INIMIGO",
                        "Após uma intensa batalha, você derrotou o INIMIGO e encontrou a saída da floresta.",
                        new String[]{"inicio","encerrar"},null)
        ),
        SEGUIR_FRENTE(
                new Cenario("Caminho em frente",
                        "O caminho à frente é íngreme e perigoso. Um INIMIGO aparece!",
                        new String[]{"batalhar", "fugir"},null)
        );
    
        private final Cenario cenario;
    
        TipoCenario(Cenario cenario) {
            this.cenario = cenario;
        }
    
        public Cenario getCenario() {
            return this.cenario;
        }





    }
    
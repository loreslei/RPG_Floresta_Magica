package Cenarios;
public class CenarioInimigo extends Cenario {
    public CenarioInimigo(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        System.out.println("O caminho à frente é íngreme e perigoso. Um INIMIGO aparece!");
        String ganhador = controle.getConflito().lutar();
        if (ganhador.equals("inimigo")) {
            controle.setCenarioAtual(new FimDerrota(controle));
        } else {
            controle.setCenarioAtual(new FimVitoria(controle));
        }

    }
    @Override
    public void proximoCenario(int opcao) {

    }


}

package Cenarios;
import Equipamentos.*;

public class CabanaCacador extends Cenario {

    private final Equipamento armadura = new Armadura("Armadura");
    public CabanaCacador(ControleCenario controle) {
        super(controle);
    }

    @Override
    public void exibir() {
        controle.getConflito().getHeroi().equipar(armadura);
        System.out.println("Você encontrou a casa do caçador e roubou uma ARMADURA.");
        System.out.println("0 - Seguir em frente");
        System.out.println("1 - Voltar");
    }

    @Override
    public void proximoCenario(int opcao) {
        if (opcao == 0) {
            controle.setCenarioAtual(new CenarioInimigo(controle));
        } else if (opcao == 1) {
            controle.voltarCenario();
        }
    }




}
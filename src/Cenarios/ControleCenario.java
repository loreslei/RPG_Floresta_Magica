package Cenarios;

import Conflito.Conflito;
import Personagens.Inimigo;
import Personagens.Personagem;

import java.util.Scanner;
import java.util.Stack;

public class ControleCenario {
    private static ControleCenario instancia;
    private Cenario cenarioAtual;
    private final Cenario cenarioInicial = new Inicio(this);
    private Conflito conflito;
    private Stack<Cenario> historico;

    private Scanner sc = new Scanner(System.in);


    public ControleCenario() {
        historico = new Stack<>();
        conflito = new Conflito("Aron Valen","Espírito da Névoa");
        cenarioAtual = cenarioInicial;
    }

    public static ControleCenario getInstancia() {
        if (instancia == null) {
            instancia = new ControleCenario();
        }
        return instancia;
    }

    public void setCenarioAtual(Cenario novoCenario) {
        if (cenarioAtual != null) {
            historico.push(cenarioAtual);
        }
        this.cenarioAtual = novoCenario;
        cenarioAtual.exibir();
    }

    public void voltarCenario() {
        if (!historico.isEmpty()) {
            cenarioAtual = historico.pop();
            cenarioAtual.exibir();
        } else {
            System.out.println("Não há cenário anterior para voltar.");
        }
    }

    public Cenario getCenarioAtual() {
        return cenarioAtual;
    }

    public Conflito getConflito() {
        return conflito;
    }

    public void reiniciarJogo() {
        conflito.getHeroi().setVida(Personagem.VIDA_MAX);
        conflito.getInimigo().setVida(Inimigo.VIDA_MAX);
        historico.clear();
        conflito.getHeroi().desequiparTudo();
        this.cenarioAtual = cenarioInicial;
        cenarioAtual.exibir();
    }

    public void inicializar()
    {
        getCenarioAtual().exibir();
        while(true){
        getCenarioAtual().proximoCenario(sc.nextInt());}
    }
}

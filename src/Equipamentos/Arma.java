
package Equipamentos;
import Personagens.Personagem;

public class Arma extends Equipamento {

    private int ataque;

    public Arma(String nome) {
        super(nome);
        this.ataque = 5;
    }

    @Override
    protected int getValorEfeito() {
        return ataque;
    }

    @Override
    protected void aplicarEfeito(Personagem personagem, int valor) {
        int novoAtaque = personagem.getAtaque() + valor;
        personagem.setAtaque(novoAtaque);
    }
}
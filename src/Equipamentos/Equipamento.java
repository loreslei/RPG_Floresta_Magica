package Equipamentos;
import Personagens.Personagem;

public abstract class Equipamento {

    private String nome;

    public Equipamento(String nome) {
        this.nome = nome;
    }

    // Template Method para adicionar efeito
    public final void adicionarEfeito(Personagem personagem) {
        int valor = getValorEfeito();
        aplicarEfeito(personagem, valor);
    }

    // Template Method para remover efeito
    public final void removerEfeito(Personagem personagem) {
        int valor = getValorEfeito();
        aplicarEfeito(personagem, -valor); // Inverte o valor para remoção
    }

    // Método a ser implementado nas subclasses para o valor específico de cada equipamento
    protected abstract int getValorEfeito();

    // Método abstrato para aplicar o efeito específico no personagem
    protected abstract void aplicarEfeito(Personagem personagem, int valor);

    public String getNome() {
        return nome;
    }
}

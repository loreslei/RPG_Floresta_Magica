public abstract class Equipamento{

    private String nome;
    public Equipamento(String nome) {
        this.nome = nome;
    }

    public abstract void adicionarEfeito(Personagem personagem);

    public abstract void removerEfeito(Personagem personagem,Equipamento equipamento);

    public String getNome() {
        return nome;
    }
}

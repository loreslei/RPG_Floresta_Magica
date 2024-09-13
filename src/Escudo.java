public class Escudo extends Equipamento {

    private int defesa;

    public Escudo(String nome) {
        super(nome);
        this.defesa = 3;
    }

    public void adicionarEfeito(Personagem personagem)
    {
        int defesa = personagem.getDefesa()+this.defesa;
        personagem.setDefesa(defesa);
    }
    public void removerEfeito(Personagem personagem,Equipamento equipamento)
    {
        int defesa = personagem.getDefesa()-this.defesa;
        personagem.setDefesa(defesa);
    }
}
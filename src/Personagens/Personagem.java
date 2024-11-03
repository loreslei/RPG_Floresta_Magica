package Personagens;
import Equipamentos.*;

import java.util.ArrayList;

public class Personagem {
    public static final int VIDA_MAX = 80;
    private String nome;
    private int vida;
    private ArrayList<Equipamento> equipamentos;
    private int ataque;
    private int defesa;
    private static Personagem personagem;

    private Personagem(String nome) {

        this.nome = nome;
        this.vida = VIDA_MAX;
        this.ataque = 15;
        this.defesa = 5;
        this.equipamentos = new ArrayList<Equipamento>();
    }

    public static Personagem getInstanciaPersonagem(String nome){
        if(personagem == null)
        {
            personagem = new Personagem(nome);
        }
        return personagem;
    }




    public void equipar(Equipamento equipamento)
    {
        if(this.equipamentos.contains(equipamento))
        {
            System.out.println(equipamento.getNome()+" já está equipada!!");
        }
        else{
            this.equipamentos.add(equipamento);
            equipamento.adicionarEfeito(this);
            System.out.println(equipamento.getNome()+" equipada com sucesso!!");
        }
    }

    //Olhar novamente
    public void desequiparTudo()
    {
            for(Equipamento equipamento : equipamentos)
            {
                equipamento.removerEfeito(this);
            }
            this.equipamentos.clear();

            System.out.println("Itens desequipados com sucesso!!");
    }
  
    public void levarDano(int dano) {this.vida-=dano;}


    public int getDefesa() {
        return defesa;
    }

    public void setVida(int vida) {this.vida = vida;}

    public void setAtaque(int ataque) {this.ataque = ataque;}

    public void setDefesa(int defesa) {this.defesa = defesa;}

    public String getNome() {return nome;}

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

   

}

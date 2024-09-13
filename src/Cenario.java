import java.util.Scanner;

public class Cenario {

    private String titulo;
    private String descricao;
    private String opcoes[];
    private Equipamento recompensa;

    public Cenario(String titulo, String descricao, String[] opcoes, Equipamento recompensa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.opcoes = opcoes;
        this.recompensa = recompensa;

    }

    public int selecionarOpcao()
    {
        int i =0;
        for (String opcao :opcoes)
        {
            System.out.println("["+i+"] = " + opcao);
            i++;
        }

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        return opcao;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Equipamento getRecompensa() {
        return recompensa;
    }
}

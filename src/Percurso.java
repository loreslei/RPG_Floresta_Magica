public class Percurso {

    protected TipoCenario tipo;

    public Percurso(TipoCenario tipo) {
        this.tipo = tipo;
    }

    public void imprimeInfo(){
        System.out.println(this.tipo.getCenario().getTitulo());
        System.out.println(this.tipo.getCenario().getDescricao());
    }

    public int escolha(){
        return this.tipo.getCenario().selecionarOpcao();
    }

    public TipoCenario getTipo() {
        return tipo;
    }

    public void setTipo(TipoCenario tipo) {
        this.tipo = tipo;
    }
    

    
    
}
package intenetmk;

public class Contrato {
    //Atributos
    private String plano;
    private float valor;
    public boolean fidelidade;
    //Metodos construtores
    public Contrato(String plano){
        
        this.fidelidade = true;
        this.valor =0;
        this.plano = plano;
    }
    
    
    
    //metodos

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;
    }

    @Override
    public String toString() {
        return "Contrato{" + "plano=" + plano + ", valor=" + valor + ", fidelidade=" + fidelidade + '}';
    }
    
    
    
}

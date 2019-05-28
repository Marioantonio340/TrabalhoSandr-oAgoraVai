package intenetmk;

public class Contrato {
    //Atributos
    private int plano;
    private float valor;
    public boolean fidelidade;
    //Metodos

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
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
    
}

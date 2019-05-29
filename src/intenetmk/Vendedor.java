package intenetmk;
import java.util.Calendar;

public class Vendedor extends Pessoa implements AcoesVenda{
        //Atributos
    private int ID;
    private float comissao;
    public int qtdVenda;
        //Metodo construtor
    public Vendedor(){
        this.qtdVenda=0;
        this.comissao=0;
        this.ID= Calendar.YEAR+Calendar.DAY_OF_YEAR+Calendar.HOUR_OF_DAY+Calendar.MINUTE+Calendar.SECOND;
    }
        //Metodos

    public String getID() {//Recebe um id int e retorna um id string
        return Integer.toString(this.ID);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getComissao() {
        return comissao;
    }

   

    public int getQtdVenda() {
        return qtdVenda;
    }

        
	// Métodos Abstratos

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome= nome;
		
	}

	@Override
	public String getCpf() {
		
		return Integer.toString(this.cpf);
	}

	@Override
	public void setCpf(int cpf) {
		this.cpf = cpf;
		
	}

    @Override
    public void vender() {
    this.qtdVenda ++;
    }

    @Override
    public void calcularComissao(float valor) {
    this.comissao=(this.qtdVenda*valor); //sera substituido por variavel de valor da venda
    this.comissao = ((this.comissao*10)/100);
    }
}

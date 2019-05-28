package intenetmk;

public class Assinante extends Pessoa {
 //Atribtos
    private String endereco;
    public String dataNasc;
    private String tel;
    //Metodo construtor
    //Metodos

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
}

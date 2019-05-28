package intenetmk;

public class Tecnico extends Pessoa {
	//Atributos 
	private float tempoMedio;
	private int instalacoesDia;
	//Metodo Construtor
	public Tecnico() {
		this.tempoMedio=0;
		this.instalacoesDia=0;
		
	}
	//Metodos
	
	public float getTempoMedio() {
		return tempoMedio;
	}

	public void setTempoMedio(float tempoMedio) {
		this.tempoMedio = tempoMedio;
	}

	public int getInstalacoesDia() {
		return instalacoesDia;
	}

	public void setInstalacoesDia(int instalacoesDia) {
		this.instalacoesDia = instalacoesDia;
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

package intenetmk;

public abstract class Pessoa {
	//Atributos
	protected String nome;
	protected int cpf;
	//metodo contrutor

    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
        
        
        
	//Metodos
	public abstract String getNome();
	
	public abstract void setNome(String nome);
	
	public abstract String getCpf();
	
	public abstract void setCpf(int cpf);
	
	
	
	
}

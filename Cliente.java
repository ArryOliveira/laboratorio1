package atividade;

public class Cliente {
	private String nome;
	private int cpf;
	private int id;
	
	
	public Cliente(int cpf) {
		super();
		this.cpf = cpf;
		
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getId(int id) {
		return id;
	}
	public void setId(int id) {
		if(id > 0)
		  this.id = id;
	}
	
	public String getNome(String nome) {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>=3) {
			this.nome=nome;
		}
	}
}



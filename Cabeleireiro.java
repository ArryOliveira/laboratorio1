package atividade;

public class Cabeleireiro {
 private int id;
 private String nome;
 private int cpf;
 
public Cabeleireiro(String nome, int cpf) {
	super();
	this.nome = nome;
	this.cpf = cpf;
}
public int getId() {
	return id;
}
public void setId(int id) {
	if(id>0)
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	if(nome.length()>=3)
	this.nome = nome;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) {
	this.cpf = cpf;
}
 
}

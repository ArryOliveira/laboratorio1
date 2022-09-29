package atividade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Atendimento {
	private Cliente cliente;
	private Calendar data;
	//private int mes;
	private Cabeleireiro cabeleireiro;
	private ArrayList<Serviço> listaServiço=new ArrayList<Serviço>();
	public Atendimento(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	public Cabeleireiro getCabeleireiro() {
		return cabeleireiro;
	}
	public void setCabeleireiro(Cabeleireiro cabeleireiro) {
		this.cabeleireiro = cabeleireiro;
	}
	public void addServiço(Serviço serviço) {
		this.listaServiço.add(serviço);
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getData() {
		System.out.println(data.getTime());
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
	
}

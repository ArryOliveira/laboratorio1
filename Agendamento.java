package atividade;

import java.util.Calendar;

public class Agendamento {
	private int id;
	private Cliente cliente;
	private Calendar data;
	private int hora;
	private int minuto;
	private Cabeleireiro cabeleireiro;
	
	public Agendamento(Cliente cliente, Cabeleireiro cabeleireiro) {
		super();
		this.cliente = cliente;
		this.cabeleireiro = cabeleireiro;
	}
	public Calendar getData() {
		return data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setData(Calendar data) {
		data=Calendar.getInstance();
		data.getTime();
		this.data=data;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	
	
}

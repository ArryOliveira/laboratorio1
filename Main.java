package atividade;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int cpf[]=new int[3];
		Calendar c=Calendar.getInstance();
		c.set(2022, 9, 28);
		Cliente clientes[]=new Cliente[3];
		Scanner ler=new Scanner(System.in);
		int cpfC[]=new int[3];
		int idC[]=new int[3];
		String nomeC[]=new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("digite o cpf do cliente");
			cpfC[i]=ler.nextInt();
			clientes[i]=new Cliente(cpfC[i]);
			System.out.println("digite o id");
			idC[i]=ler.nextInt();
			clearBuffer(ler);
			clientes[i].setId(idC[i]);
			System.out.println("digite o nome");
			nomeC[i]=ler.nextLine();
			clientes[i].setNome(nomeC[i]);
			
		}
		Cabeleireiro cabeleireiros[]=new Cabeleireiro[3];
		int cpfP[]=new int[3];
		int idP[]=new int[3];
		String nomeP[]=new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("digite o cpf do cabeleireiro");
			cpfP[i]=ler.nextInt();
			System.out.println("digite o id");
			idP[i]=ler.nextInt();
			clearBuffer(ler);
			System.out.println("digite o nome");
			nomeP[i]=ler.nextLine();
			cabeleireiros[i]=new Cabeleireiro(nomeP[i],cpfP[i]);
			cabeleireiros[i].setId(idP[i]);
			
		}
		Serviço serviços[]=new Serviço[3];
		int idS[]=new int[3];
		String nomeS[]=new String[3];
		int valor[]=new int[3];
		String desc[]=new String[3];
		for(int i=0;i<3;i++) {
			System.out.println("digite o id");
			idS[i]=ler.nextInt();
			System.out.println("digite o valor");
			valor[i]=ler.nextInt();
			clearBuffer(ler);
			System.out.println("digite o nome");
			nomeS[i]=ler.nextLine();
			System.out.println("digite a descricao");
			desc[i]=ler.nextLine();
			serviços[i]=new Serviço();
			serviços[i].setId(idS[i]);
			serviços[i].setDescricao(desc[i]);
			serviços[i].setNome(nomeS[i]);
			serviços[i].setValor(valor[i]);
			
		}
		Agendamento a[]=new Agendamento[3];
		int[] idA=new int[3];
		int hora[]=new int[3];
		int minuto[]=new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("digite o id");
			idA[i]=ler.nextInt();
			System.out.println("digite a hora");
			hora[i]=ler.nextInt();
			System.out.println("digite o minuto");
			minuto[i]=ler.nextInt();
			a[i]=new Agendamento(clientes[i],cabeleireiros[i]);
			a[i].setHora(hora[i]);
			a[i].setMinuto(minuto[i]);
			a[i].setId(idA[i]);
			a[i].setData(c);
		}
		Atendimento atendimentos[]=new Atendimento[3];
		for(int i=0;i<3;i++) {
			atendimentos[i]=new Atendimento(clientes[i]);
			atendimentos[i].addServiço(serviços[i]);
			atendimentos[i].setCabeleireiro(cabeleireiros[i]);
			atendimentos[i].setData(c);
		}
		System.out.println("lista de clientes");
		for(int i=0;i<3;i++) {
		
			System.out.println(clientes[i].getNome(nomeC[i]));
					System.out.println("cpf:"+clientes[i].getCpf());
			System.out.println("id"+clientes[i].getId(idC[i]));
			
		}
	
	System.out.println("lista de cabeleireiros");
	for(int i=0;i<3;i++) {
		
		System.out.println(cabeleireiros[i].getNome());
		System.out.println("cpf:"+cabeleireiros[i].getCpf());
		System.out.println("id:"+cabeleireiros[i].getId());
		
	}
	System.out.println("lista de agendamentos");
for(int i=0;i<3;i++) {
		
		System.out.println("id:"+a[i].getId());
		System.out.println("data:"+c.getTime());
		System.out.println("cliente:"+clientes[i].getNome(nomeC[i]));
		System.out.println("hora/minuto:"+a[i].getHora()+":"+a[i].getMinuto());
		
	}
System.out.println("lista de atendimentos");
for(int i=0;i<3;i++) {
		
		System.out.println("cliente:"+clientes[i].getNome(nomeC[i]));
		System.out.println("data:"+c.getTime());
		System.out.println("serviços:"+serviços[i].getDescricao());
		System.out.println("cabeleireiros:"+cabeleireiros[i].getNome());
		
	}
System.out.println("lista de serviços");
	for(int i=0;i<3;i++) {
		System.out.println("id:"+serviços[i].getId());
		System.out.println("nome:"+serviços[i].getNome());
		System.out.println("valor"+serviços[i].getValor());
		System.out.println("descricao:"+serviços[i].getDescricao());
	}
	}
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

	}


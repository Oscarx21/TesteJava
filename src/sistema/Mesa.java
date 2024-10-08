package sistema;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Mesa {
	
	public static Scanner scanner = new Scanner(System.in);
	
	int numMesa;
	int capacidadeMesa;
	String statusMesa;
	
	
	
	public Mesa() {
	}


	public Mesa(int numMesa, int capacidadeMesa, String statusMesa) {
		this.numMesa = numMesa;
		this.capacidadeMesa = capacidadeMesa;
		this.statusMesa = statusMesa;
	}
	
	
	public String toString() {
		return "CadastroMesa [numMesa=" + numMesa + ", capacidadeMesa=" + capacidadeMesa + ", statusMesa=" + statusMesa
				+ "]";
	}
	public int getNumMesa() {
		return numMesa;
	}
	public void setNumMesa(int numMesa) {
		this.numMesa = numMesa;
	}
	public int getCapacidadeMesa() {
		return capacidadeMesa;
	}
	public void setCapacidadeMesa(int capacidadeMesa) {
		this.capacidadeMesa = capacidadeMesa;
	}
	public String getStatusMesa() {
		return statusMesa;
	}
	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}
	
	public void CadastroMesa() {
		
		List<Mesa> listaMesa = new ArrayList();
		
		System.out.println("Informe a capacidade da mesa:");
		int capacidade = scanner.nextInt();
		
		Mesa mesa = new Mesa(listaMesa.size(),capacidade,"Disponível");
		listaMesa.add(mesa);
		
	}
	
	
}

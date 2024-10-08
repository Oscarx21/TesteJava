package sistema;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Funcionario {
	
	public static Scanner scanner = new Scanner(System.in);
	
	
	int codFuncionario;
	String nomeFuncionario;
	String cargoFuncionario;
	int totalVendasFuncionario;
	
	public Funcionario() {
	}
	
	public Funcionario(int codFuncionario, String nomeFuncionario, String cargoFuncionario, int totalVendasFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
		this.codFuncionario = codFuncionario;
		this.cargoFuncionario = cargoFuncionario;
		this.totalVendasFuncionario = totalVendasFuncionario;
	}
	
	@Override
	public String toString() {
		return "CadastroFuncionario [nomeFuncionario=" + nomeFuncionario + ", codFuncionario=" + codFuncionario
				+ ", cargoFuncionario=" + cargoFuncionario + ", totalVendasFuncionario=" + totalVendasFuncionario + "]";
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public int getCodFuncionario() {
		return codFuncionario;
	}
	
	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}
	
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}
	
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	
	public int getTotalVendasFuncionario() {
		return totalVendasFuncionario;
	}
	
	public void setTotalVendasFuncionario(int totalVendasFuncionario) {
		this.totalVendasFuncionario = totalVendasFuncionario;
	}
	
}

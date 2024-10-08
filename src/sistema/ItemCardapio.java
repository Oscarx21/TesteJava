package sistema;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class ItemCardapio {
	
		public static Scanner scanner = new Scanner(System.in);
	
		int codPrato;
		String nomePrato;
		float valorPrato;
		int qntdPrato;
		
		public ItemCardapio() {
		}
		
		
		
		public ItemCardapio(int codPrato, String nomePrato, float valorPrato, int qntdPrato) {
			super();
			this.codPrato = codPrato;
			this.nomePrato = nomePrato;
			this.valorPrato = valorPrato;
			this.qntdPrato = qntdPrato;
		}

		@Override
		public String toString() {
			return "CadastroCardapio [nomePrato=" + nomePrato + ", codPrato=" + codPrato + ", valorPrato=" + valorPrato
					+ ", qntdPrato=" + qntdPrato + "]";
		}
		public String getNomePrato() {
			return nomePrato;
		}
		public void setNomePrato(String nomePrato) {
			this.nomePrato = nomePrato;
		}
		public int getCodPrato() {
			return codPrato;
		}
		public void setCodPrato(int codPrato) {
			this.codPrato = codPrato;
		}
		public float getValorPrato() {
			return valorPrato;
		}
		public void setValorPrato(float valorPrato) {
			this.valorPrato = valorPrato;
		}
		public int getQntdPrato() {
			return qntdPrato;
		}
		public void setQntdPrato(int qntdPrato) {
			this.qntdPrato = qntdPrato;
		}
		
		
		
	}



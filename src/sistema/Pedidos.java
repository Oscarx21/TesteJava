package sistema;
import sistema.Mesa;
import sistema.ItemCardapio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Pedidos {
	
	public static Scanner scanner = new Scanner(System.in);
	
	int mesaPedido;
	int funcionarioPedido;
	float valorPedido;
	
	
	
	public Pedidos() {
	}

	public Pedidos(int mesaPedido, int funcionarioPedido, float valorPedido) {
		this.mesaPedido = mesaPedido;
		this.funcionarioPedido = funcionarioPedido;
		this.valorPedido = valorPedido;
	}
	
	@Override
	public String toString() {
		return "Pedidos [mesaPedido=" + mesaPedido + ", funcionarioPedido=" + funcionarioPedido + ", valorPedido="
				+ valorPedido + "]";
	}
	public int getMesaPedido() {
		return mesaPedido;
	}
	public void setMesaPedido(int mesaPedido) {
		this.mesaPedido = mesaPedido;
	}
	public int getFuncionarioPedido() {
		return funcionarioPedido;
	}
	public void setFuncionarioPedido(int funcionarioPedido) {
		this.funcionarioPedido = funcionarioPedido;
	}
	public float getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(float valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	public void CadastroPedido(List<Mesa> listaMesa,List<ItemCardapio> listaCardapio) {
		
		System.out.println("Informe o número da mesa:");
		for (Mesa mesa : listaMesa) {
            System.out.println(mesa);
        }
		int mesa = scanner.nextInt();
		
		boolean mesaValida = listaMesa.stream().anyMatch(m -> m.getStatusMesa() == "Disponível");
		
		if (!mesaValida){
            System.out.println("Mesa inválida!");
            return; // Sai do método se a mesa for inválida
        }else {
        	
        	int codFuncionario;
    		
    		for(ItemCardapio cardapio : listaCardapio) {
    			System.out.println(cardapio);
    		}
        	
        }
		
		
		
	}
	
}

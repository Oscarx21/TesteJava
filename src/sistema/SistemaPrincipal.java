package sistema;

import sistema.Mesa;
import sistema.Funcionario.*;
import sistema.ItemCardapio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SistemaPrincipal {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean trocarCargo = true;
		boolean sairMenu = true;
		boolean menu = true;
		
		
		while(menu = true) {
		
		// TODO Auto-generated method stub
		System.out.println("Informe o seu cargo:");
		System.out.println("1 - Garçom");
		System.out.println("2 - Cozinheiro");
		System.out.println("3 - Gerente");
		int cargo = scanner.nextInt();

		while(trocarCargo = true) {
			
			switch (cargo) {

			case 1:

				break;

			case 2:

				break;

			case 3:
				

				while (sairMenu = true) {

					System.out.println("O que você deseja fazer?");
					System.out.println("1 - Cadastrar item");
					System.out.println("2 - Cadastrar mesa");
					System.out.println("3 - Cadastrar funcionário");
					int op = scanner.nextInt();

					switch (op) {

					case 1:

						break;

					case 2:

						break;

					case 3:
						boolean funcionario = true;

						while (funcionario = true) {
							CadastroFunc();

							System.out.println("Deseja cadastrar mais funcionarios?");
							System.out.println("1 - Sim // 2 - Não");
							int escolha = scanner.nextInt();
							if (escolha == 2) {
								break;
							}
						}

						break;

					}

					System.out.println("Você deseja sair do menu?");
					System.out.println("1 - Sim // 2 - Não");
					int sair = scanner.nextInt();
					if (sair == 1) {
						sairMenu = false;
						trocarCargo = false;
						menu = true;
						break;

					}

				}

				break;
				
				default:
					System.out.println("Cargo inválido");

			}
		}
		}

	}

	public static void CadastroFunc() {

		// Informar o nome
		System.out.println("Informe o nome do funcionário:");
		String nome = scanner.next();

		// Escolher Cargo
		System.out.println("1 - Garçom, 2 - Cozinheiro, 3 - Gerente");
		System.out.println("Informe o cargo do funcionário: ");
		int op = scanner.nextInt();
		String cargo = null;

		switch (op) {
		case 1:
			cargo = "Garçom";
			break;

		case 2:
			cargo = "Cozinheiro";
			break;

		case 3:
			cargo = "Gerente";
			break;
		default:
			System.out.println("Cargo inválido");
		}

		List<Funcionario> listaFuncionario = new ArrayList();
		Funcionario func = new Funcionario(listaFuncionario.size(), nome, cargo, 0);
		listaFuncionario.add(func);
		System.out.println("Funcionario cadastrado com sucesso");

		for (Funcionario funcionario : listaFuncionario) {
			System.out.println(funcionario);
		}
	}

	public void CadastroCardapio() {

		List<ItemCardapio> listaCardapio = new ArrayList();

		System.out.println("Informe o nome do prato / bebida:");
		String nomePrato = scanner.next();

		System.out.println("Informe o valor do prato:");
		Float preco = scanner.nextFloat();

		System.out.println("Informe quantos pratos deste possuem em estoque:");
		int qntdPrato = scanner.nextInt();

		ItemCardapio cardapio = new ItemCardapio(listaCardapio.size(), nomePrato, preco, 0);
		listaCardapio.add(cardapio);

	}

	public void CadastroMesa() {

		List<Mesa> listaMesa = new ArrayList();

		System.out.println("Informe a capacidade da mesa:");
		int capacidade = scanner.nextInt();

		Mesa mesa = new Mesa(listaMesa.size(), capacidade, "Disponível");
		listaMesa.add(mesa);

	}

	public void CadastroPedido(List<Mesa> listaMesa, List<ItemCardapio> listaCardapio) {

		System.out.println("Informe o número da mesa:");
		for (Mesa mesa : listaMesa) {
			System.out.println(mesa);
		}
		int mesa = scanner.nextInt();

		boolean mesaValida = listaMesa.stream().anyMatch(m -> m.getStatusMesa() == "Disponível");

		if (!mesaValida) {
			System.out.println("Mesa inválida!");
			return; // Sai do método se a mesa for inválida
		} else {

			int codFuncionario;

			for (ItemCardapio cardapio : listaCardapio) {
				System.out.println(cardapio);
			}

		}

	}

}

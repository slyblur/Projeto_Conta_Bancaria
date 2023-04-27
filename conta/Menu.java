package conta;


import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int option;
		
		while (true) {
			
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("              | BANCO DO BRAZIL  |              ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("           1 - CRIAR CONTA                      ");
			System.out.println("           2 - LISTAR TODAS AS CONTAS           ");
			System.out.println("           3 - BUSCAR CONTA POR NUMERO          ");
			System.out.println("           4 - ATUALIZAR DADOS DA CONTA         ");
			System.out.println("           5 - APAGAR CONTA                     ");
			System.out.println("           6 - SACAR                            ");
			System.out.println("           7 - DEPOSITAR                        ");
			System.out.println("           8 - TRANSFERENCIA DE VALORES         ");
			System.out.println("           9 - ENCERRAR O PROGRAMA              ");
			System.out.println("                                                ");
			System.out.println("************************************************");
			System.out.println("Entre com a opção desejada:                     ");
			System.out.println("                                                ");
			
			option = leia.nextInt();
			
			if (option == 9) {
				System.out.println("\n Banco do Brazil - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);			
			}
			
			switch (option) {
			case 1:
				System.out.println("\n Criar Conta \n\n");
				
				break;
			
			case 2:
				System.out.println("\n Listar todas as contas \n\n");
				
				break;
				
			case 3:
				System.out.println("\n Consultar dados da Conta - por número \n\n");
				
				break;
				
			case 4:
				System.out.println("\n Atualizar dados da conta \n\n");
				
				break;
				
			case 5:
				System.out.println("\n Apagar a Conta \n\n");
				
				break;
				
			case 6:
				System.out.println("\n Saque \n\n");
				
				break;
				
			case 7:
				System.out.println("\n Depósito \n\n");
				
				break;
				
			case 8:
				System.out.println("\n Transferência entre Contas \n\n");
				
				break;	
				
				default:
				
					System.out.println("\nOpção Inválida!");
								
			}
			
			
		}
		

	}

}

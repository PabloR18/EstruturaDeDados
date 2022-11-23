import java.util.Locale;
import java.util.Scanner;

public class DesafioEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a Quantidade de Produto que deseja Cadastrar: ");
		int quantidadeProdutos = entrada.nextInt();
		
		double produtos[][] = new double[quantidadeProdutos][2];
		
		double total = 0.0;
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("Informe o ID do %dº Produto: ", i + 1);
			produtos[i][0] = entrada.nextDouble();
			System.out.printf("Informe o Valor do %dº Produto: ", i+ 1);
			produtos[i][1] = entrada.nextDouble();
				total+= produtos[i][1];
			}
		
		System.out.println("-----------------------------------");
		System.out.println("Quantidade de Produtos no Estoque: "+quantidadeProdutos );
		System.out.println("Valor total do Estoque: "+ total);
		System.out.println("-----------------------------------");
		System.out.println("-- LISTA DE PRODUTOS NO ESTOQUE --");
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("Código do Produto -> "+ produtos[i][0]);
			System.out.println(" - Valor: R$"+ produtos[i][1]);
		}
		
		entrada.close();
	}

}
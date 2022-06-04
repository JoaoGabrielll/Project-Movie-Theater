import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		
		//Inicio com o numero de cadeiras da sala:
		System.out.println("----Bem-vindo ao cimena----");
		
		System.out.println("Disponibilidade de assentos:\r\n"
				+ "  1 2 3 4 5 6 7 8 9\r\n"
				+ "1 S S S S S S S S S\r\n"
				+ "2 S S S S S S S S S\r\n"
				+ "3 S S S S S S S S S\r\n"
				+ "4 S S S S S S S S S\r\n"
				+ "-------------------\r\n"
				+ "5 S S S S S S S S S\r\n"
				+ "6 S S S S S S S S S\r\n"
				+ "7 S S S S S S S S S\r\n"
				+ "8 S S S S S S S S S\r\n"
				+ "9 S S S S S S S S S\r\n");
		
		// Variaveis utilizadas: 
		int numeroFileiras;
		int numeroAssentos;
		int resultado;
		
		//Entrada de dados:
		System.out.println("Insira o numero de fileiras");
		 numeroFileiras = tc.nextInt();
		 System.out.println("Insira o nomero de cadeiras por fila");
		numeroAssentos = tc.nextInt();
		
		//Saida de dados:
		 System.out.println("Numero de Fileiras: " + numeroFileiras);
		 System.out.println("Numero de cadeiras por fila: " + numeroAssentos);
		 resultado = Ingressos(numeroFileiras, numeroAssentos);
		 
	}
		//Metodo criado para receber dois valores inteiros:	
public static int Ingressos(int quantidadeFileiras, int cadeirasPorFila) {
		
		//Multiplicação da quantidade de assentos na sala:
		int calculo = quantidadeFileiras * cadeirasPorFila;
		
		//Calculo numero de assentos total menor que 60:
		if (calculo < 60) {
			calculo *= 10;
			System.out.println("Resultado total: R$" + calculo);
		}
		//Calculo da divisão dos assentos multiplicado com o valor de cada ingresso $10 or $8:
		else if (quantidadeFileiras >= 5) {
			calculo = ((calculo * 8) + (calculo * 10));
			System.out.println("Resultado total: R$" + + Math.ceil((double)calculo)/2);
		}
		
		/*else if (calculo % 2 == 1 && calculo > 5) {
			calculo = (calculo * 8) + (calculo * 10);
			System.out.println("Resultado total: R$" + + Math.ceil((int)calculo)/2);
		}*/
		
		return calculo;
		
	}

}

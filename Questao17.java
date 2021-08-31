import java.util.Scanner;

public class Questao17 {

	public static String transformacao(int numero) {
		//Transformação de decimais em romanos
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero;
		String numeroRomano;
		
		do {
			System.out.println("Digite um número");
			numero = leitor.nextInt();
		
		}while(numero < 1000 && numero > 0);
		
		numeroRomano = transformacao(numero);
		
		System.out.println();

	}

}

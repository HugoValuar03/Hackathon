package dadosLtda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Dados empresa = new Dados();
		
		
		System.out.println("DADOS DA EMPRESA:");
		System.out.println();
		System.out.println("Dados bancarios");
		System.out.println("Nome da agência bancária:");
		empresa.agencia =leia.next();
		System.out.println("Conta bancária:");
		empresa.conta =leia.next();
		System.out.println("Capital social:");
		empresa.capital =leia.next();
		
		System.out.println("Dados dos sócios");
		System.out.println("Nome completo:");
		empresa.nome =leia.next();
		System.out.println("CPF:");
		empresa.cpf =leia.next();
		System.out.println("Estado Civil:");
		empresa.estadoCivil =leia.next();
		System.out.println("Nacionalidade: ");
		empresa.nacionalidade =leia.next();
		
		System.out.println(empresa.toString());

	}
	
	public static class Dados{
		public String agencia;
		public String conta;
		public String capital;
		public String nome;
		public String cpf;
		public String estadoCivil;
		public String nacionalidade;
		@Override
		public String toString() {
			return "Dados [Agencia=" + agencia + ", conta=" + conta + ", capital =" + capital + ".] \n Sócio [nome=" + nome
					+ ", cpf=" + cpf + ", estado civil=" + estadoCivil + ", nacionalidade=" + nacionalidade + "]";
		}

	}
	
}

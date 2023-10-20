package cadastroLTDA;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Dados empresa = new Dados();
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dados da Empresa:");
		
		System.out.println("Nome da empresa:");
		empresa.nomeEm =leia.next();
		System.out.println("Nome fantasia:");
		empresa.nomeFa= leia.next();
		System.out.println("Objetivo empresarial:");
		empresa.objetivo= leia.next();
		
		System.out.println("Localização: ");
		System.out.println("Logradouro:");
		empresa.logradouro= leia.next();
		System.out.println("Numero:");
		empresa.numero = leia.next();
		System.out.println("CEP:");
		empresa.cep= leia.next();
		System.out.println("Complemento:");
		empresa.complemento= leia.next();
		
		System.out.println("Contato:");
		System.out.println("Email:");
		empresa.email= leia.next();
		System.out.println("Telefone Fixo:");
		empresa.tellFi= leia.next();
		System.out.println("Telefone Celular:");
		empresa.tellCl= leia.next();
	
		System.out.println(empresa.toString());
		
		
	}
	
	private static class Dados{
		String nomeEm;
		String nomeFa;
		String objetivo;
		String logradouro;
		String numero;
		String cep;
		String complemento;
		String email;
		String tellFi;
		String tellCl;
		@Override
		public String toString() {
			return "Dados [Nome da Emmpresa= " + nomeEm + ", Nome Fantasia= " + nomeFa + ", objetivo=" + objetivo + ".] \n Localização [Logradouro="
					+ logradouro + ", numero=" + numero + ", cep=" + cep + ", complemento=" + complemento + ".] \n Contato [Email="
					+ email + ", telefone fixo=" + tellFi + ", telefone celular=" + tellCl + "]";
		}
		
		
		
	}

}

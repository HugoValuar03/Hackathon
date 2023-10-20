package login;

import java.util.Scanner;

public class Cadastro {
	
	static Usuario[] cadastrar;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean continuar = true;
		
		
		
		do {
			System.out.println("Deseja login ou cadastro: ('login'/'cadastro')");
			String acao = entrada.next();
			
			if(acao.equalsIgnoreCase("login")) {
				Login.logar();
				
			} else if(acao.equalsIgnoreCase("cadastro")) {
				cadastrar();
			} else {
				continuar = false;
			}
		} while(continuar);
	}

	public static void cadastrar() {	
		
		Scanner entrada = new Scanner(System.in);
		cadastrar = new Usuario[2];
		String opcao = "sim";
		
		if(opcao.equalsIgnoreCase("sim")){
			Usuario usuario1 = new Usuario();
			System.out.println("Nome Completo: ");
			usuario1.setNomeCompleto(entrada.next());
			System.out.println("CPF: ");
			usuario1.setCpf(entrada.next());
			System.out.println("Confirme o CPF: ");
			String cpf = entrada.next();
			while(!cpf.equals(usuario1.getCpf())) {
				System.out.println("Cpf errado");
				System.out.println("Confirme o CPF: ");
				cpf = entrada.next();
			}
			System.out.println("Senha: ");
			usuario1.setSenha(entrada.next());
			System.out.println("Confime sua senha: ");
			String senha = entrada.next();
			while(!senha.equals(usuario1.getSenha())) {
				System.out.println("Senha errada");
				System.out.println("Confirme a Senha");
				senha = entrada.next();	
			}
			System.out.println(usuario1);
			
			cadastrar[0] = usuario1;
//			for (Usuario u: cadastrar) {
//			}
			
			System.out.println("Deseja criar um novo cadastro? (sim/nao)");
			opcao = entrada.next();
		} 
	}
}

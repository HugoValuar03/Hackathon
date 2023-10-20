package login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login extends Cadastro{
	

	public static void logar() {
		Cadastro cadastro = new Cadastro();
		Scanner entrada = new Scanner(System.in);
		List<String> login = new ArrayList<>();
		
		System.out.println("Comece o login");
		
        System.out.println("Digite o CPF: ");
        String cpf = entrada.next();
        System.out.println(compararCpf(cpf));
      	} 

	
	public static Usuario compararCpf(String cpf) {
		System.out.println(cadastrar);
		for (Usuario usuario : cadastrar) {
			if (usuario.getCpf().equals(cpf)) {
				return usuario;
			}
		}
		return null;
	}

	
	public void usarUsuarios(List<Usuario> listaUsuarios) {
		for (Usuario usuario : listaUsuarios) {
            System.out.println("Nome: " + usuario.getNomeCompleto());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Senha: " + usuario.getSenha());
        }
	}
}

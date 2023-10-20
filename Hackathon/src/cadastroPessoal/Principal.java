package cadastroPessoal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        DadosPessoais pessoa = new DadosPessoais();
        pessoa.lerDados();
        pessoa.imprimirDados();
    }
}

class DadosPessoais {
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private String cep;
    private String endereco;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        nome = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        cpf = scanner.nextLine();

        System.out.print("Digite o RG: ");
        rg = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        telefone = scanner.nextLine();

        System.out.print("Digite o e-mail: ");
        email = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        cep = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        endereco = scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("\nDados Pessoais:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
    }
}

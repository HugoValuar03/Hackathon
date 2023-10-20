package dadosNegocio;

import java.util.Scanner;

	public class Principal {

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        Dados pessoa = new Dados();
	        int alternativa;

	        System.out.println("DADOS DE NEG�CIO");
	        System.out.println();
	        System.out.println("Tipo de ocupa��o:");
	        System.out.println(
	        				"1-- Agente matrimonial independente \n"
	        		+       "2-- Alfaiate independente\n"
	        		+ 		"3-- Amolador de artigos de cutelaria independente \n"
	        		+		"4-- Animador(a) de festas" );
	        
	        alternativa = leia.nextInt();
	        pessoa.ocupacao = ocupacao(alternativa);
	        System.out.println("CNAE:");
			pessoa.cnae =leia.next();
			System.out.println("Descri��o sub CNAE:");
			pessoa.subCnae =leia.next();
	        System.out.println("Forma de atua��o:");
	        System.out.println(
	        		  "1--Titular\n"
	        		+ "2--Represetaante legal\n" 
	        		+ "3--Procura��o\n");
	        alternativa = leia.nextInt();
	        pessoa.atuacao = atuacao(alternativa);
	        System.out.println("Email:");
			pessoa.email =leia.next();
	    }

	    private static String ocupacao(int alternativa) {
	        String resposta;
	        if (alternativa == 1) {
	            resposta = "Agente matrimonial independente";
	        } else if (alternativa == 2) {
	            resposta = "Alfaiate independente";
	        } else if (alternativa == 3) {
	            resposta = "Amolador de artigos de cutelaria independente";
	        } else {
	            resposta = "Animador(a) de festas";
	        }

	        return resposta;
	    }
	    
	    private static String atuacao (int alternativa) {
	    	String resposta;
	    	if (alternativa == 1) {
	            resposta = "Titular";
	        } 
	    	else if (alternativa == 2) {
	            resposta = "Represetaante legal";
	        } 
	        else {
	            resposta = "Procura��o";
	        }
	    	
	    	
	    	return resposta;
	    }

	    public static class Dados {
	        String ocupacao;
	        String cnae;
	        String subCnae;
	        String atuacao;
	        String email;

	        @Override
	        public String toString() {
	            return "Dados [Ocupa��o=" + ocupacao + ", CNAE=" + cnae + ", Descri��o sub CNAE:=" + subCnae + ", atua��o=" + atuacao
	                    + ", Email=" + email + "]";
	        }
	    }
	}

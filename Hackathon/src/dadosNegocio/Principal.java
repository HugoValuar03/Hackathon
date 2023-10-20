package dadosNegocio;

import java.util.Scanner;

	public class Principal {

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        Dados pessoa = new Dados();
	        int alternativa;

	        System.out.println("DADOS DE NEGÓCIO");
	        System.out.println();
	        System.out.println("Tipo de ocupação:");
	        System.out.println(
	        				"1-- Agente matrimonial independente \n"
	        		+       "2-- Alfaiate independente\n"
	        		+ 		"3-- Amolador de artigos de cutelaria independente \n"
	        		+		"4-- Animador(a) de festas" );
	        
	        alternativa = leia.nextInt();
	        pessoa.ocupacao = ocupacao(alternativa);
	        System.out.println("CNAE:");
			pessoa.cnae =leia.next();
			System.out.println("Descrição sub CNAE:");
			pessoa.subCnae =leia.next();
	        System.out.println("Forma de atuação:");
	        System.out.println(
	        		  "1--Titular\n"
	        		+ "2--Represetaante legal\n" 
	        		+ "3--Procuração\n");
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
	            resposta = "Procuração";
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
	            return "Dados [Ocupação=" + ocupacao + ", CNAE=" + cnae + ", Descrição sub CNAE:=" + subCnae + ", atuação=" + atuacao
	                    + ", Email=" + email + "]";
	        }
	    }
	}

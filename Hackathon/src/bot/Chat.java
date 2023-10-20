package bot;

import java.util.Scanner;

public class Chat {
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in); 
		 int opcao1, opcao2;
		 
		 Chat.inicio();
		 opcao1= leia.nextInt();
		 if(opcao1<6 && opcao1>0) {
		 alternativa1(opcao1);
		 opcao2= leia.nextInt();
		 
		 System.out.println();
		 
		 alternativa2(opcao1, opcao2);
		 }
		 else {
			 System.out.println("Op��o invalida");
		 }
		 
		 System.out.println("Obrigado por escolher a StartEase");
	 }
	 
	 public static void  inicio() {
		 System.out.println("Ol�, voc� gostaria de veriificar: ");
		 System.out.println("1- Sua documenta��o");
		 System.out.println("2- Seus pagamentos");
		 System.out.println("3- Saber como funciona uma LTDA (Sociedade Limitada)");
		 System.out.println("4- Saber como funciona o MEI (Microempreendedor Individual) ");
		 System.out.println("5- Outros");
		 System.out.println();
	 }
	 
	 public static void alternativa1(int valor) {
		 if (valor <6) {
			 if(valor ==1) {
				 System.out.println("Voc� gostaria de abrir:");
				 System.out.println("1--Alvara de Funcionamento");
				 System.out.println("2--Inscri�ao Estadual");
				 System.out.println("3--Registro de junta comercial");
				 System.out.println("4--Contrato Social");
				 
			 } 
			 else if(valor ==2) {
				 System.out.println("Voc� gostaria de abrir:");
				 System.out.println("1--Pagamentos anteriores");
				 System.out.println("2--Pagementos pendentes");
				 				 
			 }
			 else if(valor ==3) {
				 System.out.println("Voc� gostaria de saber como funciona a/o:");
				 System.out.println("1--Faturamento e Atividades");
				 System.out.println("2--Tributacao");
				 System.out.println("3--Prote��o Patrimonial Limitada");

			 }
			 else if(valor ==4) {
				 System.out.println("Voc� gostaria de saber como funciona a/o:");
				 System.out.println("1--Faturamento e Atividades");
				 System.out.println("2--Tributacao Simplificada");
				 System.out.println("3--Prote��o Patrimonial Limitada");
				 
			 }
			 else if(valor ==5) {
				 System.out.println("...");
			 }
		 }
	 }
	 
	 public static void alternativa2(int valor1, int valor2) {
		 if (valor1 <6) {
			 if(valor1 ==1) {
				 if(valor2==1) {System.out.println("Abrindo o seu alvara de funcionamento");} 
				 else if(valor2==2) {System.out.println("Abrindo a sua isnscri�ao estadual");}
				 else if(valor2==3) {System.out.println("Abrindo o seu registro de junta comercial");}
				 else if(valor2==4) {System.out.println("Abrindo o seu contrato Social");}
				 else {System.out.println("Op��o invalida");}

				 
			} 
			else if(valor1 ==2) {
				if(valor2==1) {System.out.println("Abrindo seu hist�rico");} 
				else if(valor2==2) {System.out.println("Abrindo a lista de pagamentos pendentes");}
				else {System.out.println("Op��o invalida");}

			}	 				 
			else if(valor1 ==3) {
				if(valor2==1) {System.out.println("(N�o h� limites de faturamento para uma Ltda, e ela pode realizar uma ampla variedade de atividades, dependendo do objeto social definido no contrato social).");} 
				else if(valor2==2) {System.out.println("Tributa��o (A empresa deve pagar impostos de acordo com o regime tribut�rio escolhido, como Simples Nacional, Lucro Presumido ou Lucro Real).");}
				else if(valor2==3) {System.out.println(" S�cios t�m suas responsabilidades limitadas ao valor de suas quotas sociais. Em caso de d�vida, o patrim�nio pessoal dos s�cios n�o � automaticamente utilizado para quitar as d�vidas da empresa)");}
				else {System.out.println("Op��o invalida");}

			 }
			 else if(valor1 ==4) {
				if(valor2==1) {System.out.println(" � destinado a pequenos empres�rios com faturamento anual de at� R$ 81.000,00. Existem limita��es sobre quais atividades podem ser realizadas sob o regime do MEI");} 
				else if(valor2==2) {System.out.println("O empres�rio paga um valor fixo mensal, que inclui impostos federais, estaduais e municipais");}
				else if(valor2==3) {System.out.println("O patrim�nio pessoal do MEI n�o � separado do patrim�nio do neg�cio. Em caso de d�vidas, o patrim�nio pessoal do MEI pode ser utilizado para quitar as d�vidas da empresa");}
				else {System.out.println("Op��o invalida");}


			 }
		 }
			 else if(valor1 ==5) {
				 System.out.println("...");
				 
			 }
			 else {
				 System.out.println("Op��o invalida");
			 }
		 
		 System.out.println();
	 } 
}

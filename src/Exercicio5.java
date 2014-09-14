import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
    	Scanner objScan = new Scanner(System.in);
    	int voto, opcao, can1=0, can2=0, can3=0, can4=0, branco=0, nulo=0, continua=1; //Declaração de variáveis
    	//Abertura de sistema de menu com estrutura IF
    	System.out.println("Bem vindo ao sistema de votos  0.1. Por favor escolha uma opção:");
    	System.out.println("1 - Votar no candidato José.");
    	System.out.println("2 - Votar no candidato Antonio.");
    	System.out.println("3 - Votar no candidato João.");
    	System.out.println("4 - Votar no candidato Macal.");
    	System.out.println("5 - Votar em nulo.");
    	System.out.println("6 - Votar em branco.");
    	do { //Efetuar o bloco de códigos abaixo...
    		opcao = objScan.nextInt();
    		if (opcao == 1)
    			++can1; //Atribui +1 para as opções subsequentes
    		if (opcao == 2)
    			++can2;
    		if (opcao == 3)
    			++can3;
    		if (opcao == 4)
    			++can4;
    		if (opcao == 5)
    			++nulo;
    		if (opcao == 6)
    			++branco;
    		System.out.println("Você deseja continuar? (1 para sim ou 0 para não)");
    		continua = objScan.nextInt();
    		if (continua != 0){ //Se a opção continuar for selecionada, o bloco abaixo será exibido novamente
    			System.out.println("Bem vindo ao sistema de votos  0.1. Por favor escolha uma opção:");
    			System.out.println("1 - Votar no candidato José.");
    			System.out.println("2 - Votar no candidato Antonio.");
    			System.out.println("3 - Votar no candidato João.");
    			System.out.println("4 - Votar no candidato Macal.");
    			System.out.println("5 - Votar em nulo.");
    			System.out.println("6 - Votar em branco.");
    		}
    	}while (continua != 0); // ... enquanto a condição satisfazer a diferença de 0 na variável opção
    	//Exibe o total de votos em cada candidato
    	System.out.println(can1 + " Voto(s) no José.");
    	System.out.println(can2 + " Voto(s) no Antonio.");
    	System.out.println(can3 + " Voto(s) no João.");
    	System.out.println(can4 + " Voto(s) no Macal");
    	System.out.println(nulo + " Voto(s) nulo(s).");
    	System.out.println(branco + " Voto(s) no branco(s).");
    }
}
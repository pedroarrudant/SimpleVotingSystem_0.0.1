import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
    	Scanner objScan = new Scanner(System.in);
    	int voto, opcao, can1=0, can2=0, can3=0, can4=0, branco=0, nulo=0, continua=1; //Declara��o de vari�veis
    	//Abertura de sistema de menu com estrutura IF
    	System.out.println("Bem vindo ao sistema de votos  0.1. Por favor escolha uma op��o:");
    	System.out.println("1 - Votar no candidato Jos�.");
    	System.out.println("2 - Votar no candidato Antonio.");
    	System.out.println("3 - Votar no candidato Jo�o.");
    	System.out.println("4 - Votar no candidato Macal.");
    	System.out.println("5 - Votar em nulo.");
    	System.out.println("6 - Votar em branco.");
    	do { //Efetuar o bloco de c�digos abaixo...
    		opcao = objScan.nextInt();
    		if (opcao == 1)
    			++can1; //Atribui +1 para as op��es subsequentes
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
    		System.out.println("Voc� deseja continuar? (1 para sim ou 0 para n�o)");
    		continua = objScan.nextInt();
    		if (continua != 0){ //Se a op��o continuar for selecionada, o bloco abaixo ser� exibido novamente
    			System.out.println("Bem vindo ao sistema de votos  0.1. Por favor escolha uma op��o:");
    			System.out.println("1 - Votar no candidato Jos�.");
    			System.out.println("2 - Votar no candidato Antonio.");
    			System.out.println("3 - Votar no candidato Jo�o.");
    			System.out.println("4 - Votar no candidato Macal.");
    			System.out.println("5 - Votar em nulo.");
    			System.out.println("6 - Votar em branco.");
    		}
    	}while (continua != 0); // ... enquanto a condi��o satisfazer a diferen�a de 0 na vari�vel op��o
    	//Exibe o total de votos em cada candidato
    	System.out.println(can1 + " Voto(s) no Jos�.");
    	System.out.println(can2 + " Voto(s) no Antonio.");
    	System.out.println(can3 + " Voto(s) no Jo�o.");
    	System.out.println(can4 + " Voto(s) no Macal");
    	System.out.println(nulo + " Voto(s) nulo(s).");
    	System.out.println(branco + " Voto(s) no branco(s).");
    }
}
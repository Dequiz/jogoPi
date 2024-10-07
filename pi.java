package jogoPI;

import java.util.Random;
import java.util.Scanner;

public class jogopi {
	
	
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
	 
	 int x,y,z,dificulty = 2;
	 String dificultyString = "Médio" ;
	 boolean ForT , alterarDificuldade;
	 
	 do {
		 
		 ForT = true;
		 System.out.println("\u001B[0m--------------------\n|1-Jogar\n|2-Mudar dificuldade\n|3-Sair\n--------------------");
			x = ler.nextInt();
			limparConsole();
			if(x > 3 || x < 0) {
				System.out.println("Valor invalido insira novamente");
				continue;
			}
			switch(x) {
			case 1:
				iniciarJogo(dificulty);
				break;
			case 2:
				do {
					
					alterarDificuldade = true;
					System.out.println("\u001B[0m--------------------\n|1-Fácil\n|2-Médio(padrão)\n|3-Difícil\n|4-Impossível\n--------------------");	
					y = ler.nextInt();
					limparConsole();
					if(y > 4 || y < 0) {
						System.out.println("Valor invalido, insira novamente");
					}
					switch(y) {
					case 1:
						
						dificulty = 1;
						dificultyString = "Fácil";
						break;
					case 2:
						dificulty = 2;
						dificultyString = "Médio";
						break;
					case 3: 
						dificulty = 3;
						dificultyString = "Difícil";
						break;
					case 4:
						dificulty = 4;
						dificultyString = "Impossível";
					}
					
					if(dificulty == 1) {
						System.out.printf("Dificuldade alterada para \u001B[32m%s\n",dificultyString);
					}else if(dificulty == 2) {
						System.out.printf("Dificuldade alterada para \u001B[33m%s\n",dificultyString);
					}else if(dificulty == 3){
						System.out.printf("Dificuldade alterada para \u001B[31m%s\n",dificultyString);
					}else if (dificulty == 4) {
						System.out.printf("Dificuldade alterada para \u001B[30m%s\n",dificultyString);
					}
				
				
				System.out.println("\u001B[0m--------------------\n|1-Sair\n|2-Mudar dificuldade\n--------------------\n");
				z = ler.nextInt();
				limparConsole();
				
			   if(z > 3 || z < 0 ) {
				   System.out.println("Valor invalido, insira novamente");
			   }
				switch(z) {
				case 1:
					System.out.println("Saindo do menu...");
					alterarDificuldade = false;
					break;
				case 2:
					continue;
				}
			}while(alterarDificuldade);
				break;
			case 3:
				System.out.println("Saindo do jogo...");
				break;
			default:
				System.out.println("Valor invalido, Insira novamente");
				continue;
				}
			
	 }while(ForT);
	 
	 ler.close();
	}
      
        public static void iniciarJogo(int dificulty) {
        	Scanner lerTwo = new Scanner(System.in);
        	Random r = new Random();
        	int n = 0, w = 0 ;
        	boolean ForTtwo = true;
        	
        	System.out.println("");
        	if(dificulty == 1) {
        		n = r.nextInt(10) + 1;
        	}
        	else if(dificulty == 2) {
        		n = r.nextInt(50) + 1;
        	}
        	else if(dificulty == 3) {
        		n = r.nextInt(100) + 1;
        	}else if(dificulty == 4) {
        		n = r.nextInt(100000) + 1;
        	}
        	do {
        		System.out.println("\u001B[0m--------------------------\n|Tente adivinhar o número|\n--------------------------");
        		w = lerTwo.nextInt();
        		limparConsole();
        		if(n > w ) {
        			System.out.println("\u001B[31mMaior");
        		}else if (n < w) {
        			System.out.println("\u001B[33mMenor");
        		}else if (n == w) {
        			System.out.println("\u001B[32mAcertou!!!");
        			ForTtwo = false;
        			}
        	}while(ForTtwo);
        	 
        }
         
        public static void limparConsole() {
	        for (int i = 0; i < 50; i++) {
	            System.out.println(); 
	        }
	    }


 
}

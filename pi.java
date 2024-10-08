package jogoPI;

import java.util.Random;
import java.util.Scanner;

public class jogopi {
	public static void main(String[] args) {
		iniciarJogo();
	}
	

	public static void iniciarJogo() {
		Scanner sc = new Scanner(System.in);
		boolean ForT = true;
		
		do {
			System.out.println(
					"\u001B[0m-------------Bem vindo ao multiJogos-------------\n|1-Desafio Numerico\n|2-Batalha de programação\n|4-Sair\n-------------------------------------------------");
			
			int u = sc.nextInt();
			
			if (u > 4 || u <= 0) {
				System.out.println("Valor invalido insira novamente");
				continue;
			}
			if( u == 1) {
				selecaoDosJogos(u);
			}else if(u == 2) {
				iniciarBatalhaProgramacao();
			}
		}while(ForT);
		
			}

	public static void selecaoDosJogos(int u) {
        Scanner sc = new Scanner(System.in);
        if (u == 1) {
			menuOpcoes();
		}else if(u == 2) {
			menuOpcoes();
		}else if(u == 4){
			System.exit(0);
		}
	}

	// ----------------Menu de opcoes do jogo-----------------------
	public static void menuOpcoes() {
		Scanner ler = new Scanner(System.in);

		int x, y, z, dificulty = 2;
		String dificultyString = "Médio";
		boolean ForT, alterarDificuldade;

		do {

			ForT = true;
			System.out.println(
					"\u001B[0m--------------------\n|1-Jogar\n|2-Mudar dificuldade\n|3-Sair\n--------------------");
			x = ler.nextInt();
			limparConsole();
			if (x > 3 || x < 0) {
				System.out.println("Valor invalido insira novamente");
				continue;
			}
			switch (x) {
			case 1:
				iniciarDesafioNumerico(dificulty);
				break;
			case 2:
				do {

					alterarDificuldade = true;
					System.out.println(
							"\u001B[0m--------------------\n|1-Fácil\n|2-Médio(padrão)\n|3-Difícil\n|4-Impossível\n--------------------");
					y = ler.nextInt();
					limparConsole();
					if (y > 4 || y < 0) {
						System.out.println("Valor invalido, insira novamente");
					}
					switch (y) {
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

					if (dificulty == 1) {
						System.out.printf("Dificuldade alterada para \u001B[32m%s\n", dificultyString);
					} else if (dificulty == 2) {
						System.out.printf("Dificuldade alterada para \u001B[33m%s\n", dificultyString);
					} else if (dificulty == 3) {
						System.out.printf("Dificuldade alterada para \u001B[31m%s\n", dificultyString);
					} else if (dificulty == 4) {
						System.out.printf("Dificuldade alterada para \u001B[35m%s\n", dificultyString);
					}
                    System.out.println(
							"\u001B[0m--------------------\n|1-Sair\n|2-Mudar dificuldade\n--------------------\n");
					z = ler.nextInt();
					limparConsole();

					if (z > 3 || z < 0) {
						System.out.println("Valor invalido, insira novamente");
					}
					switch (z) {
					case 1:
						System.out.println("Saindo do menu...");
						alterarDificuldade = false;
						break;
					case 2:
						continue;
					}
				} while (alterarDificuldade);
				break;
			case 3:
				System.out.println("Saindo do Menu...");
				iniciarJogo();
				
			default:
				System.out.println("Valor invalido, Insira novamente");
				continue;
			}

		} while (ForT);

		ler.close();
	}

	// ---------------Desafio Numerico----------------//
	public static void iniciarDesafioNumerico(int dificulty) {
		Scanner lerTwo = new Scanner(System.in);
		Random r = new Random();
		int n = 0, w = 0;
		if (dificulty == 1) {
			n = r.nextInt(10) + 1;
		} else if (dificulty == 2) {
			n = r.nextInt(50) + 1;
		} else if (dificulty == 3) {
			n = r.nextInt(100) + 1;
		} else if (dificulty == 4) {
			n = r.nextInt(100000) + 1;
		}
		boolean ForTtwo = true;
		do {
			System.out.println(
					"\u001B[0m--------------------------\n|Tente adivinhar o número|\n--------------------------");
			w = lerTwo.nextInt();

			limparConsole();
			if (n > w) {
				System.out.println("\u001B[31mMaior");
			} else if (n < w) {
				System.out.println("\u001B[33mMenor");
			} else if (n == w) {
				System.out.println("\u001B[32mAcertou!!!");
				ForTtwo = false;
			} else {
				System.out.println("Valor Invalido, Insira novamente");
			}

		} while (ForTtwo);

	}

	// ----------------------------------------------//
    //Batalha de programação-------------------------//
	public static void iniciarBatalhaProgramacao() {
		
		Scanner lerFour = new Scanner(System.in);
		String[] desafios = {"System.out.println('Olá')\nSystem.out.println('Beleza?')"};
		System.out.println(desafios[0]);
		
		
	}
	
	//-----------------------------------------------//
	// Menu de Jogos--------------------------------------//
	public static void menuJogos(int dificulty) {
		Scanner lerThree = new Scanner(System.in);
		int v = 0;

		limparConsole();
		System.out.println(
				"\u001B[0m--------------------\n|1-Desafio Numérico\n|2-xxxxxxx\n|3-xxxxxxx\n--------------------");
		v = lerThree.nextInt();
		if (v == 1) {
			iniciarDesafioNumerico(dificulty);
		}
		lerThree.close();
	}

	// ------------------------------------------------//
    //Metodo para limpeza do terminal------------------
	public static void limparConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	//-------------------------------------------------
}

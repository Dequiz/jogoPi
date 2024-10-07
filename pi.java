import java.util.Scanner;
public class programa{
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
     int x,y,z,dificulty = 2;
     String dificultyString = "Médio" ;
     boolean ForT , alterarDificuldade;
     do {

       ForT = true;
       System.out.println("--------------------\n|1-Jogar\n|2-Mudar dificuldade\n|3-Sair\n--------------------");
        x = ler.nextInt();
        limparConsole();
        if(x > 3 || x < 0) {
          System.out.println("Valor invalidom insira novamente");
        }
        switch(x) {
        case 1:

          break;
        case 2:
          do {

            alterarDificuldade = true;
            System.out.println("--------------------\n|1-Fácil\n|2-Médio(padrão)\n|3-Difícil\n--------------------");	
            y = ler.nextInt();
            limparConsole();
            if(y > 3 || y < 0) {
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
            }

            if(dificulty == 1) {
              System.out.printf("Dificuldade alterada para \u001B[32m%s\n",dificultyString);
            }else if(dificulty == 2) {
              System.out.printf("Dificuldade alterada para \u001B[33m%s\n",dificultyString);
            }else if(dificulty == 3){
              System.out.printf("Dificuldade alterada para \u001B[31m%s\n",dificultyString);
            }


          System.out.println("\u001B[0m--------------------\n|1-Sair\n|2-Mudar dificuldade\n--------------------\n");
          z = ler.nextInt();
          limparConsole();
           if(z > 3 || z < 0 ) {
             System.out.println("Valor invalido, insira novamente");
           }
          switch(z) {
          case 1:

            alterarDificuldade = false;
            break;
          case 2:

            break;
          }
        }while(alterarDificuldade);
        case 3:

          System.out.println("Saindo do jogo...");
          continue;
        default:
          System.out.println("Valor invalido, Insira novamente");
          continue;
          }

     }while(ForT);
    ler.close();
    }



          public static void limparConsole() {
            for (int i = 0; i < 50; i++) {
                System.out.println(); 
            }
        }
  }

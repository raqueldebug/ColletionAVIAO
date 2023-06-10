import java.util.Scanner;

public class Agenda {
    Scanner in = new Scanner(System.in);
    String SEGUNDA ;

    String TERCA ;

    public void MostrarDiaseHorariosDisponiveis() {

        System.out.println("\nPor gentileza, escolha a data de sua preferência");
        //POSSO MELHORAR ESSA PARTE COLOCANDO UMA MATRIZ PRA FAZER VARREDURA DOS DIAS DOS MESESS
         SEGUNDA = "===Segunda-Feira 03/07/23 às 10 horas da manhã===";

         TERCA = "===Terça-Feira 04/07/23 às 11 horas da manhã===";

        System.out.println("\n"+SEGUNDA);
        System.out.println("\n"+TERCA);
    }

    int escolhadia;

    public void EscolhaDia() {
        System.out.println("\nDigite 1 para Segunda-Feira ou 2 para Terça-Feira: ");
        escolhadia = in.nextInt();
        MostrarDataEscolhida(SEGUNDA,TERCA);
        if (escolhadia == 1) {

            System.out.println("\nAgora vamos escolher os assentos");
            //ADD metodos da class passagem

        } else if (escolhadia == 2) {
            System.out.println("\nAgora vamos escolher os assentos");

        } else {

        }

    }

    public void MostrarDataEscolhida(String SEGUNDA,String TERCA){

        if(escolhadia == 1){

            System.out.println("Data escolhida foi: "+SEGUNDA);
        }else{
            System.out.println("Data escolhida foi: "+TERCA);
        }


    }


}

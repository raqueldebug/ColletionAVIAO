public class Voo {

    //criar lista com os assentos para poder mostrar e escolher



    public static void main(String[] args) {

        Voo voo = new Voo();



    }

    public void MostrarDoisLadosAssentos() {
        System.out.println("\n");
        System.out.println("Assentos do lado esquerdo");
        LadoEsquerdo();
        System.out.println("\n");
        System.out.println("Assentos do lado direito");
        LadoDireito();
    }

    public void LadoEsquerdo() {


        final int Linha = 3; //total de linhas

        final int Coluna = 10; //total de colunaa

        int valorIncial = 1; //meu numero inicializador que vai ser incrementado


        //  char[] chaves = {'A', 'B', 'C'}; // Chaves para identificar as linhas // FICA PRA MAIS TARDE
        char[] chaves = {'A'};

        int[][] AssentosEsquerdo = new int[Linha][Coluna];

        /*for(int l= 0;l<Linha;l++){
            for(int c =0;c<Coluna;c++){
                AssentosEsquerdo

            }
        }*/

        //AQUI ESTOU ADICIONANDO NUMEROS EM ORDEM DE 1 A 10
        for (int l = 0; l < Linha; l++) {
            for (int c = 0; c < Coluna; c++) {
                AssentosEsquerdo[l][c] = valorIncial;
                valorIncial++;
            }
        }


        //IMPRIME OS VALORES QUE ADICIONEI NA MATRIZ

        //
        for (int l = 0; l < Linha; l++) {

            for (int c = 0; c < Coluna; c++) {


                System.out.print(AssentosEsquerdo[l][c] + " ");
            }
            System.out.print("\n");
        }


    }


    public void LadoDireito() {

        final int Linha = 3; //total de linhas

        final int Coluna = 10; //total de colunaa

        int valorIncial = 31; //meu numero inicializador que vai ser incrementado


        char[] chaves = {'A', 'B', 'C'}; // Chaves para identificar as linhas // FICA PRA MAIS TARDE


        int[][] AssentosDireito = new int[Linha][Coluna];

        /*for(int l= 0;l<Linha;l++){
            for(int c =0;c<Coluna;c++){
                AssentosEsquerdo

            }
        }*/

        //AQUI ESTOU ADICIONANDO NUMEROS EM ORDEM DE 1 A 10
        for (int l = 0; l < Linha; l++) {
            for (int c = 0; c < Coluna; c++) {
                AssentosDireito[l][c] = valorIncial;
                valorIncial++;
            }
        }


        //IMPRIME OS VALORES QUE ADICIONEI NA MATRIZ

        //
        for (int l = 0; l < Linha; l++) {
            for (int c = 0; c < Coluna; c++) {

                System.out.print(AssentosDireito[l][c] + " ");

            }
            System.out.print("\n");
        }


    }
}



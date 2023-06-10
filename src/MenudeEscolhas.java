import java.util.Scanner;

public class MenudeEscolhas {
    Voo voo = new Voo();
    Agenda agenda = new Agenda();
    Passageiros passageiros = new Passageiros();
    Conta conta = new Conta();
    int ValorPassagem = 0;

    int numerobilhet = 123456;

    public static void main(String[] args) throws InterruptedException {
        MenudeEscolhas menudeEscolhas = new MenudeEscolhas();
        menudeEscolhas.Menuescolha();
    }


    public void ReservaBilhete() throws InterruptedException {


        System.out.println("\n====Reservas de Bilhetes====");
        passageiros.CadastrareConfirmarPassageiro();

        agenda.MostrarDiaseHorariosDisponiveis();
        agenda.EscolhaDia();

        System.out.println("\n-Poltronas disponíveis");
        voo.MostrarDoisLadosAssentos();
        System.out.println("Digite o lado que deseja: (ESQUERDO) ou (DIREITO)");
        String EscolhaLado = in.next();

        if (EscolhaLado.equalsIgnoreCase("ESQUERDO")) {
            System.out.println("Lado escolhido: " + EscolhaLado);
        } else if (EscolhaLado.equalsIgnoreCase("DIREITO")) {
            System.out.println("Lado escolhido: " + EscolhaLado);

        }
        System.out.println("\nÓtimo, estamos quase finalizando...");
        Thread.currentThread().sleep(1000);


        System.out.println("\nAgora digite o número da poltrona que deseja sentar ");

        int EscolhaPoltrona = in.nextInt();


        System.out.println("Agora iremos concluir com sua compra");

        Thread.currentThread().sleep(1000);

        if (passageiros.SaldoLivre == passageiros.SaldoCrianca) {

            ValorPassagem = conta.PassagemCrianca;
        } else if (passageiros.SaldoLivre == passageiros.SaldoAdulto) {
            ValorPassagem = conta.PassagemAdulto;

        } else {
            System.out.println("sem saldo");
        }

        System.out.println("você possui saldo de: " + passageiros.SaldoLivre + ", valor da passagem: " + ValorPassagem);
        Thread.currentThread().sleep(3000);

        System.out.println("Compra realizada com sucesso");


        System.out.println("Deseja conferir sua compra? Digite a opção desejada:\n(1) SIM ou (2) NÃO");
        int ConferirCompra = in.nextInt();

        ConferirCompra();

    }

    public void ConferirCompra() {

        System.out.println("\n");
        System.out.println("====DETALHES DO BILHETE====");
        System.out.println("Nome comprador: " + passageiros.nome);
        System.out.println("Categotia: " + passageiros.categoria);
        System.out.println("Número do bilhete: " + numerobilhet);
        agenda.MostrarDataEscolhida(agenda.SEGUNDA, agenda.TERCA);
        System.out.println("Valor do bilhete: " + ValorPassagem);
        System.out.println("\n");


    }

    //AGORA VAMOS CRIAR CONFORME O ENUNCIADO

    //Reserva de bilhetes
    //Cancelamento
    //Verficação bilhete - quem reservou
    Scanner in = new Scanner(System.in);


    public void Menuescolha() throws InterruptedException {
        int EscolhaMenu;

        System.out.println("\nBem vindo ao menu princial, por gentileza, digite a opção desejada");
        int Voltar = 6;
        do {
            do {
                System.out.println("(1) Reservar Bilhete");
                System.out.println("(2) Cancelar Bilhete");
                System.out.println("(3) Verificar Bilhete");
                EscolhaMenu = in.nextInt();

                if (EscolhaMenu == 1) {
                    ReservaBilhete();

                } else if (EscolhaMenu == 2) {
                    CancelamentoBilhete();

                } else if (EscolhaMenu == 3) {
                    ConferirCompra();

                } else {
                    System.out.println("Opção incorreta, por gentileza, digite novamente");
                }
            } while (EscolhaMenu > 3);
        } while (Voltar == 6);


        //usar o for quando for muito grande o menu- exemplo ele faz a contagem do total de itens no menu dai ele pergunta se for diferente dos numeros gerados ele volta


    }


    /*public void CancelamentoBilhete() {

        System.out.println("Bilhete disponivel: ");

        ConferirCompra();

        System.out.println("Para cancelar digite 1: ");
        int OpCancelar = in.nextInt();

        if (OpCancelar == 1) {
            //PENSAR EM UM METODO PRA PODER LIMPAR VAR
            System.out.println("Bilhete cancelado com sucesso");
        }


    }*/

    public void CancelamentoBilhete() {

        System.out.println("Bilhete disponivel: ");

        ConferirCompra();

        System.out.println("Para cancelar digite 1: ");
        int OpCancelar = in.nextInt();


        passageiros.nome = "";
        numerobilhet = 0;
        passageiros.categoria = "";
        agenda.MostrarDataEscolhida(agenda.SEGUNDA="",agenda.TERCA="");
        ValorPassagem = 0;


        if (OpCancelar == 1) {
            //PENSAR EM UM METODO PRA PODER LIMPAR VAR
            System.out.println("Bilhete cancelado com sucesso");
        }


    }


}



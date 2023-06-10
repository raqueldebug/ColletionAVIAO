import java.util.Scanner;

public class Passageiros {

    String nome;
    int idade;


    int SaldoAdulto = 600;
    int SaldoCrianca = 300;

    int SaldoLivre;
    String categoria;


    Scanner in = new Scanner(System.in);

    public void Categoria() {
        if (idade > 17) {
            categoria = "ADULTO";

        } else {
            categoria = "CRIANÇA";
        }
    }

    public void VerificarTipodePassageiro() {


        System.out.println();

        if (idade > 17) {
            SaldoLivre = SaldoAdulto;

            PassageiroAdulto();

        } else if (idade < 18) {
            SaldoLivre = SaldoCrianca;
            PassageiroCrianca();


        }
    }


    public void CadastrarUsuario() {

        System.out.println("Vamos realizar o seu cadastro ");
        System.out.println("Digite seu nome: ");
        nome = in.next();
        System.out.println("Digite sua idade: ");
        idade = in.nextInt();
        Categoria();
    }

    public void PassageiroAdulto() {

        nome = nome;
        idade = idade;
        int saldoAdulto = SaldoLivre;

        System.out.println("Senhor(a): " + nome + ", sua categoria é ADULTO, possui saldo livre de: " + SaldoAdulto);
    }

    public void PassageiroCrianca() {
        nome = nome;
        idade = idade;
        int saldoCrianca = SaldoLivre;

        System.out.println("Senhor(a): " + nome + ", sua categoria é CRIANÇA, possui saldo livre de: " + SaldoCrianca);
    }

    Mensagensrepetidas mensagensrepetidas = new Mensagensrepetidas();

    public void CadastrareConfirmarPassageiro() throws InterruptedException {


        //Castro usuario
        CadastrarUsuario();
        //sinalizo que foi executao e armazenado
        mensagensrepetidas.CadastroRealizado();

        Thread.currentThread().sleep(400);
        VerificarTipodePassageiro();
    }

}



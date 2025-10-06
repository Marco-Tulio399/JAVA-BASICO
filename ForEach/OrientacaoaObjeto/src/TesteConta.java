import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        conta1.nome = "Marco";
        conta1.numConta = 1;
        conta1.saldo = 100;
        conta1.tipo = "Especial";
        conta1.limite = 500;

        System.out.println("Digite o numero da conta para saber informações da sua conta:");
        int infoConta =  scanner.nextInt();
        if(infoConta==1) {
            System.out.println("Nome: " + conta1.nome);
            System.out.println("Numero da conta: " + conta1.numConta);
            System.out.println("Saldo: " + conta1.saldo);
            System.out.println("Tipo: " + conta1.tipo);
            System.out.println("Limite: " + conta1.limite);
        }
        else{
            System.out.println("Comando inválido");

        }
    }
}

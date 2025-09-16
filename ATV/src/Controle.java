import java.util.Scanner;

public class Controle {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um valor: ");
        double valor = scan.nextDouble();
        if(valor <= 10) {
            System.out.println("Muito barato");
        }
            else if(valor > 10 && valor <15){
                System.out.println("Peça desconto");
            }
            else if(valor >= 15 && valor <17){
                System.out.println("Melhor pesquisar mais");
        }
            else{
                System.out.println("Caro demais");
        }
    }
}

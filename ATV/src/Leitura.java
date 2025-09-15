import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo:");
        String nomeCompleto = input.nextLine();
        System.out.println("Seu nome completo: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome:");
        String primeiroNome = input.next();
        System.out.println("Seu primeiro nome: " + primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Sua idade : " + idade);

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Sua altura: " + altura);*/

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura, e se possui bichos de estimação? ");
        String primeiroNome1 = input.next();
        int idade1 = input.nextInt();
        int filhos = input.nextInt();
        float altura1 = input.nextFloat();
        boolean pet1 = input.nextBoolean();
        System.out.println("Seu primeiro nome é:" +  primeiroNome1);
        System.out.println("Sua idade é:" + idade1);
        System.out.println("Você tem:" + filhos + "filhos");
        System.out.println("Tem " + altura1 + "cm de altura");
        System.out.println("Tem bicho de estimação?" + pet1);
    }
}

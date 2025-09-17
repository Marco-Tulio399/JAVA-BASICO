import java.util.Scanner;
/* criar dois vetores diferentes, criar o terceiro vetor com a multiplicação de um vetor pelo outro*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt();
        }
        System.out.println(" ");
        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = scanner.nextInt();
        }
        System.out.println(" ");

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}

import java.util.Scanner;
/* Um vetor igual ao outro x2*/
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for(int i=0; i<vetorA.length; i++){
            System.out.println("Digite um valor para a posição " + (i+1) + "º do vetor:");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i]*2;
        }
        System.out.println("");
        System.out.println("Vetor A:");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.println("Vetor B:");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}

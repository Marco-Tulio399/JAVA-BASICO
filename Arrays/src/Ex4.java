import java.util.Scanner;
/* Saber quais os números do vetor são par*/
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                cont++;
            }
        }
        int [] vetorP = new int[cont];
        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetorP[j] = vetor[i];
                j++;
            }
        }
        System.out.println(" ");
        System.out.println("Os valores pares são");
        for (int i=0; i<vetorP.length; i++){
            System.out.println(" " + vetorP[i]);
        }
    }
}

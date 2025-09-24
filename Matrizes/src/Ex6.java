import java.util.Random;
import java.util.Scanner;

public class Ex6 {
public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    Random randNum = new Random();

    int[][] matriz = new int[4][4];

    for (int i = 0; i<matriz.length; i++){
        for (int j = 0; j<matriz[i].length; j++){
            matriz[i][j] = randNum.nextInt(9);
        }
    }
    int maior = matriz[0][0];
    int linha = 0;
    int coluna = 0;
    for (int i = 0; i<matriz.length; i++){
        for (int j = 0; j<matriz[i].length; j++){
            if(matriz[i][j]>=maior){
                maior = matriz[i][j];
                linha = i;
                coluna = j;
            }
        }
    }
    for (int i = 0; i<matriz.length; i++){
        for (int j = 0; j<matriz[i].length; j++){
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Maior número:" + maior);
    System.out.println("Linha: " + (linha+1));
    System.out.println("Coluna: " + (coluna+1));

}
}

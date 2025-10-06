import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        for (int n : numeros) {
            System.out.println("Número: " + n);
        }
    }
}

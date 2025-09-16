import java.util.Scanner;

public class Fatorial {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero para saber o seu fatorial: ");
        int i = scan.nextInt();
        int fat = 1;
        for(int j=i;j>0;j--){
            fat = fat * j;
        }
        System.out.println(fat);
    }
}

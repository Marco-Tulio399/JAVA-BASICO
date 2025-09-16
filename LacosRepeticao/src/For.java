import java.util.Scanner;

public class For {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        for(int i=0; i<=100; i++){
            soma = i+soma;
        }
        System.out.println(soma);
    }
}

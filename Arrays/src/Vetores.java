import java.util.Scanner;
public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[10];
        temperaturas[0]=31.2;
        temperaturas[1]=29.4;
        temperaturas[2]=34;
        temperaturas[3]=32.7;
        temperaturas[4]=36;

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("A temperatura do dia " + (i+1) + " foi " + temperaturas[i]);
        }
    }
}

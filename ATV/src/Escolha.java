import java.util.Scanner;

public class Escolha {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dia da semana 1a7: ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
                case 2:
                    System.out.println("Segunda");
                    break;
                    case 3:
                        System.out.println("terça");
            case 4:
                System.out.println("quarta");
                break;
                case 5:
                    System.out.println("quinta");
                    break;
                    case 6:
                        System.out.println("sexta");
                        break;
            case 7:
                System.out.println("sabado");
                break;
                default:
                    System.out.println("Dia inválido");

        }
    }
}

import java.util.Scanner;
public class TesteAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno marco = new Aluno();

        System.out.println("Digite seu nome:");
        marco.nome = scanner.nextLine();
        System.out.println("Digite sua matricula:");
        marco.matricula = scanner.nextLine();
        System.out.println("Digite seu curso:");
        marco.curso = scanner.nextLine();
        System.out.println("Digite o nome das disciplinas:");
        for(int i = 0; i < marco.disciplina.length; i++){
            marco.disciplina[i] = scanner.nextLine();
        }
        System.out.println("Digite as notas das disciplinas respectivamente:");
        for(int i = 0; i < marco.nota.length; i++){
            marco.nota[i] = scanner.nextDouble();
        }
        marco.mostraInfo();

    }
}
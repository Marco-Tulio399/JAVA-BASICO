public class Aluno {
    String nome;
    String matricula;
    String curso;
    String[] disciplina = new String[3];
    double[] nota =  new double[3];

    void mostraInfo(){
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Matricula: " +matricula);
        System.out.println("Curso:" +curso);
        System.out.println("Disciplina e notas:");
        for(int i = 0; i < disciplina.length; i++){
            System.out.println(disciplina[i] + " - " + nota[i]);
        }
    }
}

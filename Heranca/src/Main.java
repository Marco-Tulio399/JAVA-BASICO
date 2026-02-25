public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Pessoa pessoa = new Pessoa();

        aluno.setNome("Maria");
        professor.setNome("Joao");
        pessoa.setNome("Claudio");

        aluno.setEndereco("Rua 1, numero 1");
        professor.setEndereco("Rua 2, numero 2");
        pessoa.setEndereco("Rua 3, numero 3");


        System.out.println(aluno.obterEndereco());
        System.out.println(professor.obterEndereco());
        System.out.println(pessoa.obterEndereco());

    }
}
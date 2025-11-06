public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1, "Pamela", 500, "Especial");
        conta1.sacar(250);
        System.out.println("Titular: " + conta1.getTitular());
        conta1.setTitular("Marco Túlio");
        System.out.println("Novo titular: " + conta1.getTitular());
    }
}
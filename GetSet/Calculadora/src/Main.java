public class Main {
    public static void main(String[] args) {
        new Calc();
        new Calc();
        System.out.println(Calc.Soma(2, 4));
        System.out.println(Calc.Subtracao(5, 4));
        System.out.println(Calc.Divisao(8, 2));
        System.out.println(Calc.Multiplicacao(5, 5));
        System.out.println(Calc.Potencia(5, 3));
        System.out.println(Calc.Fatorial(5));
        Calc.Zerar();
        System.out.println(Calc.contador);
    }
}
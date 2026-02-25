public class Calc {
    static int contador = 0;

    Calc(){
        contador++;
    }
    static void Zerar(){
        contador = 0;
    }
    static int Soma(int a, int b){
        return a+b;
    }
    static int Subtracao(int a, int b){
        return a-b;
    }
    static int Multiplicacao(int a, int b){
        return a*b;
    }
    static double Divisao(double a, double b){
        return a/b;
    }
    static double Potencia(double base, double expoente){
        return Math.pow(base, expoente);
    }
    static double Fatorial(double a){
        int resultado = 1;
        for(int i = 1; i <= a; i++){
            resultado = resultado*i;
        }
        return resultado;
    }
}

public class Lampada {
    private boolean ligada;

    public Lampada(){
        this.ligada = false;
    }
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A lâmpada foi ligada");
        } else {
            System.out.println("A lâmpada já está ligada");
        }
    }
        public void desligar(){
            if(ligada){
                ligada = false;
                System.out.println("A lâmpada foi desligada");
            }
        }
    public void verificar(){
            if(ligada) {
                System.out.println("Ligada");
            }
            else{
                System.out.println("Desligada");
                }
            }
        }


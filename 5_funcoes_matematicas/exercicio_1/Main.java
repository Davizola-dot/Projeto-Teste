public class Main {
    public static void main(String[] args){

        boolean luz = true;
        if (luz) {
            System.out.println("Luz Acesa");
        } else {
            System.out.println("Luz Apagada");
        }

        luz = false;
        if (luz) {
            System.out.println("Luz Acesa !!!");
        } else {
            System.out.println("Luz Apagada");
        }

        int tempo = 20;
        String mensagem = (tempo < 10) ? "Bom dia" : "Boa noite!";
        System.out.println(mensagem);
    }
}
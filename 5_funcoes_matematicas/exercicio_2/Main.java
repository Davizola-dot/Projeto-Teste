public class Main {

    public static void main(String[] args) {
        int idade = 101;
        String exibe = "";

        if (idade >= 0 && idade <= 12) {
            exibe = "Crian";
        } else if (idade >= 13 && idade <= 17) {
            exibe = "Adolescente";
        } else if (idade >= 18 && idade <= 64) {
            exibe = "Adulto";
        } else if (idade >= 65 && idade < 100) {
            exibe = "Idoso";
        } else {
            exibe = "Defunto fudido";
        }

        System.out.println(exibe);
    }
}
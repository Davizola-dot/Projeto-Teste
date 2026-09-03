
public class Main {
    public static void main(String[] args) {

        int[] numeros = {1,0,13,-5,66};

        for(int positivo : numeros ){
            if (positivo > 0){
                System.out.println(positivo + " positivo");
            };

            if (positivo < 0){
                System.out.println(positivo + " negativo");
            };

            if (positivo == 0){
                System.out.println(positivo + " nulo");
            };

            
        }
    }
}

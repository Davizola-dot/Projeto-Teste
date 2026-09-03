public class Main {
public static void main(String[] args) {
    
    String[] produtos = {"pao", "agua", "leite", "iogurte", "bife"};

    for (int i = 0; i <= 4; i++){

    System.out.println(produtos[i]);
    }

    System.out.print("----------------------------------------\n");

    for (String itens : produtos) {
        System.out.println(itens);
        
    }

}    
}

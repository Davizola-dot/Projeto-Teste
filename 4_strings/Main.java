public class Main {
public static void main(String[] args) {
    String saudacao = "Hello World";
    System.out.println(saudacao.length());
    System.out.println(saudacao.toUpperCase());
    System.out.println(saudacao.toLowerCase());

    String aluno_1 = "Miranata";
    String aluno_2 = "Aeronauta";
    System.out.println(aluno_1.equals(aluno_2));

    String nome = "Weverton";
    String sobrenome = "Wanderlei";
    System.out.println(nome + "" + sobrenome);    

    String aluno_3 = "Pedinte";
    System.out.println(aluno_3.contains("Paz")); 
    
    String frutas = String.join("-", "Laranja", "Banana");
    System.out.println(frutas);

    String nome_completo = "Denis";
    System.out.println(nome_completo.replace("D", "P"));

    String frase = "Repetição com \"correção\"" leva à \"Perfeição\"
}
    
}
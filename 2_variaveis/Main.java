public class Main {
    public static void main(String[] args) {
        String nome = "Pedro";
        String sobrenome = "Soares";
        int idade = 18;
        double altura = 1.81;
        boolean empregado = true;
        String telefone = "(15) 9968-15248";
        String empresa = "AcrilCore";
        double salario = 2500;
        String endereco = "Rua Francisco Bernardes 550";
        String cep = "18271-500";
        String cidade = "Tatui";
        String uf = "Sao Paulo";
        String mae = "Vasti";
        String pai = "Rodrigo";

      
        System.out.println("--- DADOS PESSOAIS ---");
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Mae: " + mae);
        System.out.println("Pai: " + pai);

        System.out.println("\n--- CONTATO E ENDERECO ---");
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereco: " + endereco);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade/UF: " + cidade + "/" + uf);

        System.out.println("\n--- INFORMACOES PROFISSIONAIS ---");
        System.out.println("Empregado: " + (empregado ? "Sim" : "Não"));
        System.out.println("Empresa: " + empresa);
        System.out.println("Salario: R$ " + salario);
    }
}
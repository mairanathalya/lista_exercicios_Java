import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        float percentualAumento = 0.20f;
        String opcao = "";
        float salarionovo = 0;
        float valoraumento = 0;
    //um looping para ler vários salários
        while (!opcao.equalsIgnoreCase("fim")) {

            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite seu salário: ");
            float salario = Float.parseFloat(leitor.nextLine());
    //verificando se pode ou não ter um aumento
            if (salario < 500){
                System.out.println("Você está apto para receber um aumento! ");
                valoraumento = salario * percentualAumento;
                System.out.println("Seu aumento foi de : " + valoraumento);
                salarionovo = salario + valoraumento;
                System.out.println("Seu salário agora é: " + salarionovo);
            } else {
                System.out.println("Você não tem direito de receber um aumento");
            }
    //finalizando o looping
            System.out.println("Para encerrar o programa digite fim ");
            opcao = leitor.nextLine();
        }
    }
}
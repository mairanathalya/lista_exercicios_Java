import java.util.Scanner;

public class Questão5 {
    static public void main(String[] arg){
        float valormaxprestacao = 0.3f;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor do seu salário? ");
        float salariobruto = leitor.nextFloat();

        System.out.println("Qual o valor da prestação? ");
    //verificando se pode ter algum empréstimo
        float valorprestacao = leitor.nextFloat();
        float salariop = salariobruto * valorprestacao;
    //decisão
        if (valorprestacao <= (valormaxprestacao* salariop )){
            System.out.println("Você não tem direito ao empréstimo");
        } else {
            System.out.println("Você tem direito ao empréstimo! ");
        }
    }
}
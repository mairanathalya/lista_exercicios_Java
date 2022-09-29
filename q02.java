import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        var numero = 0;

        Scanner leitor = new Scanner(System.in);
    //fazendo um looping para perguntar 10 vezes
        for (int i = 0 ; i < 10; i++){
            System.out.println("Digite um número: ");
            numero = leitor.nextInt();
    //Conta para saber se o número é par ou ímpar
            if (numero % 2 == 0){
                System.out.println("Este número é Par : " + numero);
            } else {
                System.out.println("Este número é Ímpar : " + numero );
            }
        }
    }
}
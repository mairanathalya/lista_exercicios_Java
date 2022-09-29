import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        float diaria = 40.0f;
        float conta1 = 0;
        float conta2 = 0;
        float totalarrecadado = 0;
        String encerrar = "";
        int taxa1 = 15;
        int taxa2 = 8;

        Scanner leitor = new Scanner(System.in);
    //looping para coleta de dados
        while (!encerrar.equalsIgnoreCase("fim")){
            System.out.println("Digite seu nome: ");
            String nome = leitor.next();
            System.out.println("Informe quantos dias deseja se hospedar: ");
            int quantdias = leitor.nextInt();
    //calculando as contas de cada cliente dependendo da quantidade de dias hospedado
            if (quantdias >= 10){
                conta1 += taxa1;
                conta1++;
                System.out.println("Para " + quantdias +" dias, o valor de cada diaria é de " +conta1 + " reais");
            } else{
                conta2+= taxa2;
                conta2++;
                System.out.println("Para " + quantdias + " dias, o valor de cada diaria é de " + conta2 +" reais");
            }
    //fechamento do while
            System.out.println("Para finalizar digite 'fim' ");
            encerrar = leitor.next();
        }
    //informações requisitado pela pousada
        totalarrecadado = conta1 + conta2;
        System.out.println("O valor total arrecadado pela pousada foi de " + totalarrecadado);
    }
}
public class Questão1 {
    public static void main(String[] args) {
        float credito = 100;
        float percentualaumento = 0.15f;

        System.out.println("Seu crédito era de : " + credito );
    //calculo para o salário com o novo credito
        float novosalario = (credito * percentualaumento);

        System.out.println("Seu novo crédito com o aumento é de: " + (credito + novosalario));
    }
}
import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args){
        float Valorgasolina= 2.50f;
        float Valorrefrigerante = 3.00f;
        float refrigerante = 2;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos litros tem o tanque do carro? ");
        float Litros = leitor.nextFloat();
    //calculando a conta da gasolina
       float ContadaGasolina = Litros * Valorgasolina;
       System.out.println("Valor da conta da gasolina deu: " + ContadaGasolina +" reais");
    //calculando conta do refrigerante e conta total
       var ContadoRefrigerante = refrigerante * Valorrefrigerante;
       float conta = ContadaGasolina + ContadoRefrigerante;
       System.out.println("O valor total da conta deu: " + conta +" reais");
    }
}

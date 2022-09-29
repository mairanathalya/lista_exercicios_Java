import java.util.Scanner;

public class Questao8 {
    public static void main(String[] arg) {
        int quantPacientes = 0;
        int quantHomens = 0;
        int quantMulheres = 0;
        float pesoM = 0;
        int quantIdade = 0;
        int idadeH = 0;
        int idadeM = 0;
        float altM = 0f;
        int mediaH = 0;
        float peso = 0f;
        int idade = 0;
        float altura = 0f;
        String nome = "";
        String nomeBaixa = "";
        String nomevelho = "";
        float altB = 200f;
        int idadeMax = 200;
        String opcao = "";

            Scanner leitor = new Scanner(System.in);
    //coletando informações dos pacientes
        while (!opcao.equalsIgnoreCase("Fim")) {
            System.out.println("Digite seu sexo, M ou F : ");
            String sexo = leitor.next();
    //condições para caso for homem faça algo e se for mulher faça outro caso
            if (sexo.equalsIgnoreCase("M")) {
                quantHomens++;

                System.out.println("Digite seu nome: ");
                nome = leitor.next();

                System.out.println("Digite seu peso: ");
                peso = leitor.nextFloat();

                System.out.println("Digite sua idade: ");
                idade = leitor.nextInt();
                idadeH++;
                if (idade < idadeMax){
                    nomevelho = nome;
                 }

                System.out.println("Digite sua altura: ");
                altura = leitor.nextFloat();

            } else if (sexo.equalsIgnoreCase("F")) {
                quantMulheres++;

                System.out.println("Digite seu nome: ");
                nome = leitor.next();

                System.out.println("Digite seu peso: ");
                peso = leitor.nextFloat();

                if (peso > 70) {
                    pesoM++;
                }
                System.out.println("Digite sua idade: ");
                idade = leitor.nextInt();
                idadeM++;

                System.out.println("Digite sua altura: ");
                altura = leitor.nextFloat();
                if (altura < altB) {
                    nomeBaixa = nome;
                }

                if (altura >= 1.60 && altura <= 1.70) {
                    altM++;

                }
            } else if (idadeH >= 18 && idadeH <= 25) {
                quantIdade++;

            } else if (idadeM >= 18 && idadeM <= 25) {
                quantIdade++;
            }
    //Mostrar todas informações de cada paciente separado        

            System.out.println("Paciente : " + nome + " Sexo : " + sexo + " Peso : " + peso + " Idade : " + idade + " Altura : " + altura);
        }
    //Fechamento do while
        System.out.println("Para encerrar o programa digite 'Fim' ");
         opcao = leitor.next();

    //informações requisitadas pela clínica
        quantPacientes = quantHomens + quantMulheres;
        System.out.println("A quantidade de pacientes:  " + quantPacientes);
        mediaH = idadeH / quantHomens;
        System.out.println("A média da idade dos homens:  " + mediaH);
        System.out.println("A quantidade de mulheres com altura entre 1.60 e 1.70:  " + altM + ", e com peso acima de 70Kg: " + pesoM);
        System.out.println("A quantidade de pacientes com idade entre 18 e 25: " + quantIdade);
        System.out.println("O nome do paciente mais velho: " +nomevelho);
        System.out.println("O nome da paciente mais baixa: " +nomeBaixa);
    }
}
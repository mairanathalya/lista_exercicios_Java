import java.util.Scanner;

public class Questão6 {
    public static void main(String[ ] arg){
        var totalaprovados = 0;
        var totalexame = 0;
        var totalreprovados = 0;
        float mediatotal = 0;

        Scanner leitor  = new Scanner(System.in);
    //fazendo looping para perguntar 6 vezes
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite nota 1: ");
            float nota1 = leitor.nextFloat();
            System.out.println("Digite nota 2: ");
            float nota2 = leitor.nextFloat();
            float media = nota1 + nota2/ 2;
            System.out.println("Sua média é: " + media);
            mediatotal = media/6;

    //condições para verificar se o aluno foi aprovado, está em recuperação ou reprovado
            if (media >7){
                System.out.println("Está aprovado ");
                totalaprovados++;
            } else if (media > 3 && media < 7 ){
                System.out.println("Está exame");
                totalexame++;
            } else {
                System.out.println("Está reprovado");
                totalreprovados++;
            }
        }
    //Informações dos alunos 
        System.out.println("O total de alunos aprovados foi de " + totalaprovados);
        System.out.println("O total de alunos reprovados foi de " + totalreprovados);
        System.out.println("O total de alunos em recuperação foi de " + totalexame);       
        System.out.println("A média da classe é: " + mediatotal);
    }
}
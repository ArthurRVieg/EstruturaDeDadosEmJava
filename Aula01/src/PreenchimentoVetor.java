import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args) {
        // Entrada
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        sc.close();

        //Saída
        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }
}

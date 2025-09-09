import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i = 0 ; i < vetor.length ; i++) {
            System.out.print("vetor[" + i + "] = ");
            vetor[i] = sc.nextInt();
        }

        sc.close();

        //Processamento
        boolean troquei = true;
        while (troquei) {
            troquei = false;

            for (int i = 0 ; i < (vetor.length - 1) ; i++) {
                if(vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    troquei = true;
                }
            }
        }
        //Saída
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

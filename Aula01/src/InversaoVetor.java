import java.util.Scanner;

public class InversaoVetor {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        int[] vetorOriginal = new int[5];
        int[] vetorInvertido = new int[5];

        for (int i = 0 ; i < vetorOriginal.length ; i++) {
            System.out.print("vetorOriginal[" + i + "] = ");
            vetorOriginal[i] = sc.nextInt();
        }

        sc.close();

        // Processamento
        for (int i = 0 ; i < vetorInvertido.length ; i++) {
            vetorInvertido[i] = vetorOriginal[vetorInvertido.length - 1 - i];
        }

        //Saída
        for (int i = 0 ; i < vetorInvertido.length ; i++) {
            System.out.println("vetorInvertido[" + i + "] = " + vetorInvertido[i]);
        }
    }
}

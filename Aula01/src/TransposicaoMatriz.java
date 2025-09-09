import java.util.Scanner;

public class TransposicaoMatriz {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        int[][] matrizOriginal = new int[2][3];
        int[][] matrizTransposta = new int[3][2];

        for (int i = 0 ; i < matrizOriginal.length ; i++) {
            for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
                System.out.print("matrizOriginal[" + i + "][" + j + "] = ");
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

        sc.close();

        //Processamento
        for (int i = 0 ; i < matrizTransposta.length ; i++) {
            for (int j = 0 ; j < matrizTransposta[i].length ; j++) {
                matrizTransposta[i][j] = matrizOriginal[j][i];
            }
        }

        //Saída
        System.out.println("!!! Matriz Origina !!!l");
        for (int i = 0 ; i < matrizOriginal.length ; i++) {
            for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("!!! Matriz Transposta !!!");
        for (int i = 0 ; i < matrizTransposta.length ; i++) {
            for (int j = 0 ; j < matrizTransposta[i].length ; j++) {
                System.out.print(matrizTransposta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

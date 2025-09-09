import java.util.Scanner;

public class BuscaExaustiva {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10000000];
        int achei = -1;
        int busca = 0;

        //Contrução de vetor
        for (int i = 0 ; i < vetor.length ; i++) {
            vetor[i] = ((int) (vetor.length * Math.random()));
        }

        //Realização da busca
        System.out.println("Digite o número a ser buscado: ");
        busca = sc.nextInt();

        sc.close();

        for (int i = 0 ; i < vetor.length ; i++) {
            if (busca == vetor[i]) {
                achei = i;
                break;
            }
        }
        //Saída
        if(achei == -1) {
            System.out.println("Não achei !!!");
        } else {
            System.out.println("Achei na posição " + achei);
        }
    }
}

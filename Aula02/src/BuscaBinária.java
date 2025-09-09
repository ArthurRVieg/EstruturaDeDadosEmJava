import java.util.Scanner;

public class BuscaBinária {
    public static void main(String[] args) {
        //Entrada
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10000000];
        int achei = -1;
        int busca = 0;
        int inicio = 0;
        int meio = 0;
        int fim = 0;

        //Contrutção do vetor
        for (int i = 0 ; i <  vetor.length ; i++) {
            vetor[i] = i;
        }

        //Realização da busca
        System.out.print("Digite o número a ser buscado: ");
        busca = sc.nextInt();

        sc.close();

        inicio = 0;
        fim = (vetor.length - 1);
        while (fim >= inicio) {
            meio = ((inicio + fim) / 2);
            if(busca == vetor[meio]) {
                achei = meio;
                break;
            } else if (busca < vetor[meio]) {
                fim = (meio -1);
            } else {
                inicio = (meio + 1);
            }
        }
        //Divulgação do resultado
        if (achei == -1) {
            System.out.println("Não achei");
        } else {
            System.out.println("Achei na posição " + achei);
        }
    }
}

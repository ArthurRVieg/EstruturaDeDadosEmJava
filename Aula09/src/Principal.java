public class Principal {
    public static void main(String[] arg) {
       Arvore objArvore = new Arvore();

       for (int i = 0 ; i < 10000000 ; i++) {
           objArvore.inserir(i);
       }

       objArvore.imprimir();
    }
}

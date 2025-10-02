public class Arvore {
    // Propriedades da classe
    private No raiz = null;

    // Métodos da classe
    public void incluir (int numero) {
        raiz = incluir(raiz, numero);
    }

    private No incluir(No raiz, int numero) {
        // Caso fácil: árvore vazia
        if (raiz == null) {
            return new No(numero, null, null);
        }

        // Caso díficil: árvore NÃO vazia
        int sorteio = ((int) (2 * Math.random()));

        if (sorteio == 0) {
            raiz.setEsquerda(incluir(raiz.getEsquerda(), numero));
        } else {
            raiz.setDireita(incluir(raiz.getDireita(), numero));
        }

        return raiz;
    }

    public void navegarPreOrdem() {
        System.out.print("Pré-Ordem: ");
        navegarPreOrdem(raiz);
        System.out.println();
    }

    private void navegarPreOrdem(No raiz) {
        if (raiz == null) {
            return;
        }

        System.out.print(raiz.getNumero());
        navegarPreOrdem(raiz.getEsquerda());
        navegarPreOrdem(raiz.getDireita());
    }

    public void navegarEmOrdem() {
        System.out.print("Em-Ordem: ");
        navegarEmOrdem(raiz);
        System.out.println();
    }

    private void navegarEmOrdem(No raiz) {
        if (raiz == null) {
            return;
        }

        navegarEmOrdem(raiz.getEsquerda());
        System.out.print(raiz.getNumero());
        navegarEmOrdem(raiz.getDireita());
    }

    public void navegarPosOrdem() {
        System.out.print("Pos-Ordem: ");
        navegarPosOrdem(raiz);
        System.out.println();
    }

    private void navegarPosOrdem(No raiz) {
        if (raiz == null) {
            return;
        }

        navegarPosOrdem(raiz.getEsquerda());
        navegarPosOrdem(raiz.getDireita());
        System.out.print(raiz.getNumero());
    }
}

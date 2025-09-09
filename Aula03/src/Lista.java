public class Lista {
    //Propriedades da classe
    private No cabeca = null;

    //Métodos da classe
    public void inserir(int numero) {
        //Cenário fácil
        if (cabeca == null) {
            cabeca = new No(numero, null);
            return;
        }

        //Cenário difícil: lista NÃO vazia
        No ultimo = cabeca;
        while(ultimo.getProximo() !=null){ // Laço que procura na lista o último nó
            ultimo = ultimo.getProximo();
        }
        ultimo.setProximo(new No(numero, null));
    }
    public void excluir (int numero) {
        // Cenário Muito fácil: lista vazia
        if (cabeca == null) {
            return;
        }

        //Cenário fácil: excluir o primeiro
        if (cabeca.getNumero() == numero) {
            cabeca = cabeca.getProximo();
            return;
        }

        // Cenário difícil: excluir no meio ou no final
        No anterior = cabeca;
        while((anterior.getProximo() != null) && (anterior.getProximo().getNumero() != numero)) {
            anterior = anterior.getProximo();

        }
        if(anterior.getProximo() != null) {
            anterior.setProximo(anterior.getProximo().getProximo());
        }
    }
    public void imprimir() {
        No ponteiro = cabeca;
        while (ponteiro != null) {
            System.out.println(ponteiro.getNumero());
            ponteiro = ponteiro.getProximo();
        }
    }
}

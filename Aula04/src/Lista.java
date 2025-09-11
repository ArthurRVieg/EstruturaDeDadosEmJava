public class Lista {
    //Propriedades da classe
    private No cabeca = null;

    //Métodos da classe
    public void inserir(int numero) {
        No novoNo = new No(numero, cabeca, null);
        if(cabeca != null) {
            cabeca.setAnterior(novoNo);
        }
        cabeca = novoNo;
    }

    public void excluir(int numero) {
        //Cenário MUITO fácil: lista vazia
        if (cabeca == null) {
            return;
        }

        //Cenário fácil: excluir primeiro nó da lista
        if(cabeca.getNumero() == numero) {
            cabeca = cabeca.getProximo();
            if(cabeca != null) {
                cabeca.setAnterior(null);
            }
            return;
        }

        //Cenário difícil: procurar o nó a ser excluído
        No ponteiro = cabeca.getProximo();
        while (ponteiro != null) {
            if(ponteiro.getNumero() == numero) {
                ponteiro.getAnterior().setProximo(ponteiro.getProximo());
                if(ponteiro.getProximo() != null) {
                    ponteiro.getProximo().setAnterior(ponteiro.getAnterior());
                }
                return;
            }
            ponteiro = ponteiro.getProximo();
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

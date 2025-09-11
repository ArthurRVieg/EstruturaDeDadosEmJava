import java.sql.SQLOutput;

public class Lista {

    private No cabeca = null;

    public void inserir (int numero){
        //caso muito facil: lista vazia
        if (cabeca == null){
            cabeca = new No(numero, null);
            cabeca.setProximo(cabeca);
            return;
        }
        //caso facil: so tem um unico numero na lista
        if (cabeca.getProximo()== cabeca){
            cabeca.setProximo(new No(numero, cabeca));
            return;
        }
        //Caso dificil: tem varios nós na lista
        No ultimo = cabeca;
        while (ultimo.getProximo() != cabeca){
            ultimo = ultimo.getProximo();
        }
        ultimo.setProximo(new No(numero, cabeca));

    }
    public void excluir (int numero){
        //muito facil: lista vazia
        if (cabeca == null){
            return;
        }
        //caso facil: excluir o primeiro e unico no da lista
        if ((cabeca.getNumero()== numero)&&(cabeca.getProximo()== cabeca)){
            cabeca = null;
            return;
        }
        //caso dificil: excluir o primeiro de uma lista que tem mais de um nó
        if (cabeca.getNumero()== numero){
            No ultimo = cabeca;
            while (ultimo.getProximo() != cabeca){
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(cabeca.getProximo());
            cabeca = cabeca.getProximo();
            return;
        }
        //caso muito dificil: excluir no do meio ou final da lista
        No ponteiro = cabeca;
        while (ponteiro.getProximo() != cabeca){
            if (ponteiro.getProximo().getNumero()== numero){
                ponteiro.setProximo(ponteiro.getProximo().getProximo());
                return;
            }
            ponteiro = ponteiro.getProximo();
        }
    }
    public void imprimir(){
        boolean primeiraVez = true;
        No ponteiro = cabeca;
        if (ponteiro == null){
            return;
        }
        while ((ponteiro != cabeca) || (primeiraVez)){
            System.out.println(ponteiro.getNumero());
            primeiraVez = false;
            ponteiro = ponteiro.getProximo();
        }
    }
}

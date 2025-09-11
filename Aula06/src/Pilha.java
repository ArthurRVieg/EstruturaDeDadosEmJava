public class Pilha {
    private No cabeca = null;

    public void push(int numero){
        cabeca = new No(numero, cabeca);

    }
    public void pop(){
        if(cabeca == null){
            return;
        }
        System.out.println(cabeca.getNumero());
        cabeca = cabeca.getProximo();
    }
}

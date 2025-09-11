public class Fila {

    private No cabeca = null;

    public void entrar (int numero){
        cabeca = new No(numero,cabeca);

    }

    public void sair (){
        //caso muito facil: fila vazia
        if(cabeca == null){
            return;
        }
        //caso facil: fila so tem um unico no
        if (cabeca.getProximo()==null){
            System.out.println(cabeca.getNumero());
            cabeca = null;
            return;
        }
        //caso dificil: se tiver mais de um no
        No penultimo = cabeca;
        while (penultimo.getProximo().getProximo()!= null){
            penultimo = penultimo.getProximo();
        }
        System.out.println(penultimo.getProximo().getNumero());
        penultimo.setProximo(null);
    }
}

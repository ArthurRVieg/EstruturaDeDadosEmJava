public class Principal {
    public static void main(String[] args) {
        Lista objLista = new Lista();

        objLista.inserir(1);
        objLista.imprimir();

        objLista.inserir(2); objLista.inserir(3); objLista.inserir(4);
        objLista.imprimir();

       objLista.excluir(1);objLista.excluir(3);objLista.excluir(4);
       objLista.imprimir();

       objLista.excluir(2);
       objLista.imprimir();

       for (int i = 0; i<500000; i++){
           objLista.inserir(i);
       }
       objLista.imprimir();
    }
}
